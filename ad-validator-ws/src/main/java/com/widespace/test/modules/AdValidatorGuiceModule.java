package com.widespace.test.modules;

import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.guice.JerseyServletModule;
import com.sun.jersey.guice.spi.container.servlet.GuiceContainer;
import com.sun.jersey.spi.container.servlet.ServletContainer;
import com.widespace.test.filters.InitFilter;
import com.widespace.test.restservices.AdValidatorResource;

import java.util.HashMap;
import java.util.Map;

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
