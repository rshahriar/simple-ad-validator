package com.widespace.test.restservices;

import com.google.common.base.Optional;
import com.google.common.base.Stopwatch;
import com.google.common.base.Strings;

import com.widespace.test.cache.CacheManager;
import com.widespace.test.models.AdStatusEntity;
import com.widespace.test.responseModels.AppStatusResponse;

import org.apache.log4j.Logger;

import javax.inject.Inject;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * Web service class resolves path 'validate' and takes a GET
 * query parameter for processing validation status request.
 */

@Path("validate")
public class AdValidatorResource {

    static final Logger logger = Logger.getLogger(AdValidatorResource.class);

    private final CacheManager cacheManager;

    @Inject
    public AdValidatorResource(CacheManager cacheManager) {
        this.cacheManager = cacheManager;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public AppStatusResponse getAdValidationStatus(@DefaultValue("") @QueryParam("uuid") String uuid) {
        if (Strings.isNullOrEmpty(uuid)) {
            return new AppStatusResponse(uuid, false);
        }
        boolean appValid = false;
        Stopwatch timer = Stopwatch.createStarted();
        try {
            /**
             * Check on cache - if found in cache then return the cached one
             * Else the cache will automatically load the Entity from DB
             */
            Optional<AdStatusEntity> value = cacheManager.getEntity(uuid);
            if (value.isPresent()) {
                AdStatusEntity adStatusEntity = value.get();
                appValid = adStatusEntity.isAppStatus();
            }
        } catch (Exception ex) {
            logger.error("Unable to process validation status request: " + ex.getMessage());
        }
        logger.info("Processing Time: " + timer.stop());
        return new AppStatusResponse(uuid, appValid);
    }
}
