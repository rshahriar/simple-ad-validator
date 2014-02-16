package com.widespace.test.listners;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;

import com.widespace.test.modules.AdValidatorGuiceModule;
import com.widespace.test.modules.JpaModule;

public class GuiceServletListener extends GuiceServletContextListener {

    @Override
    protected Injector getInjector() {
        return Guice.createInjector(
            new JpaModule(),
            new AdValidatorGuiceModule()
        );
    }
}
