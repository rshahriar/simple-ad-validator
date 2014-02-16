package com.widespace.test.filters;

import com.widespace.test.cache.CacheManager;
import com.widespace.test.manager.DatabaseManager;

import java.io.IOException;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

@Singleton
public class InitFilter implements Filter {

    private final DatabaseManager databaseManager;
    private final CacheManager cacheManager;

    @Inject
    public InitFilter(DatabaseManager databaseManager, CacheManager cacheManager) {
        this.databaseManager = databaseManager;
        this.cacheManager = cacheManager;
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // initialize database - inserts 100 randomly generated id
        databaseManager.initializeDb();

        // initialize LoadingCache
        cacheManager.initializeCache();
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
        throws IOException, ServletException {
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        // do nothing
    }
}
