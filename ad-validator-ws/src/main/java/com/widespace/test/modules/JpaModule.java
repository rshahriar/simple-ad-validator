package com.widespace.test.modules;

import com.widespace.test.cache.CacheManager;
import com.widespace.test.manager.DatabaseManager;

import com.google.inject.Scopes;
import com.google.inject.persist.PersistFilter;
import com.google.inject.persist.jpa.JpaPersistModule;
import com.google.inject.servlet.ServletModule;

public class JpaModule extends ServletModule {

    @Override
    protected void configureServlets() {
        bind(DatabaseManager.class).in(Scopes.SINGLETON);
        bind(CacheManager.class).in(Scopes.SINGLETON);

        JpaPersistModule jpaPersistModule = new JpaPersistModule("ad-validator-jpa");
        install(jpaPersistModule);
        filter("/*").through(PersistFilter.class);
    }
}
