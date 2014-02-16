package com.widespace.test.modules;

import com.sun.jersey.guice.JerseyServletModule;
import com.sun.jersey.guice.spi.container.servlet.GuiceContainer;
import com.sun.jersey.spi.container.servlet.ServletContainer;
import com.widespace.test.filters.InitFilter;
import com.widespace.test.restservices.AdValidatorResource;

import java.util.HashMap;
import java.util.Map;

/**
 * This Servlet module binds the path resolver classes powered
 * by Jersey. This class also starts up the web app context for guice.
 * This class also calls the InitFilter to initialize the to be
 * injected objects.
 */

public class AdValidatorGuiceModule extends JerseyServletModule {
    @Override
    protected void configureServlets() {
        bind(AdValidatorResource.class);

        // configure servlet mapping
        Map<String, String> params = new HashMap<>();
        params.put(ServletContainer.FEATURE_FILTER_FORWARD_ON_404, "true");
        params.put(ServletContainer.PROPERTY_WEB_PAGE_CONTENT_REGEX, "/static/(.)*");
        filter("/*").through(GuiceContainer.class, params);

        filter("/*").through(InitFilter.class);
    }
}
