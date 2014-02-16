package com.widespace.test.cache;

import com.google.common.base.Optional;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import com.widespace.test.manager.DatabaseManager;
import com.widespace.test.models.AdStatusEntity;

import javax.inject.Inject;

/**
 * This CacheManager uses Guava LoadingCache for loading not existing objects
 * from Database. This cache is local to each run of the Server instance.
 */
public class CacheManager {

    private static final int MAX_SIZE = 1000;

    private final DatabaseManager databaseManager;
    private LoadingCache<String, AdStatusEntity> loadingCache;

    @Inject
    public CacheManager(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    public void initializeCache() {
        loadingCache = CacheBuilder.newBuilder()
            .maximumSize(MAX_SIZE)
            .build(new CacheLoader<String, AdStatusEntity>() {
                @Override
                public AdStatusEntity load(String key) throws Exception {
                    return databaseManager.getAdStatusEntity(key);
                }
            });
    }

    public Optional<AdStatusEntity> getEntity(String key) throws Exception {
        AdStatusEntity adStatusEntity = loadingCache.get(key);
        return Optional.fromNullable(adStatusEntity);
    }
}
