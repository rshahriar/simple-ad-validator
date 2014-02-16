package com.widespace.test.modules;

import com.google.inject.Scopes;
import com.google.inject.persist.PersistFilter;
import com.google.inject.persist.jpa.JpaPersistModule;
import com.google.inject.servlet.ServletModule;

import com.widespace.test.cache.CacheManager;
import com.widespace.test.manager.DatabaseManager;

/**
 * Persistent module, we bind DatabaseManager and call the PersistFilter
 * to start JpaPersisModule service.
 */
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
