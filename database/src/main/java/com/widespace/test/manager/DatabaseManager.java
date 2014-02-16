package com.widespace.test.manager;

import com.google.inject.Inject;
import com.google.inject.persist.Transactional;

import com.widespace.test.models.AdStatusEntity;

import java.util.UUID;

import javax.inject.Provider;
import javax.persistence.EntityManager;

public class DatabaseManager {

    private Provider<EntityManager> entityManagerProvider;

    @Inject
    public DatabaseManager(Provider<EntityManager> emProvider) {
        this.entityManagerProvider = emProvider;
    }

    private EntityManager getEntityManager() {
        return this.entityManagerProvider.get();
    }

    public void initializeDb() {
        if (getAppCount() == 0) {
            for (int i=0; i<100; i++) {
                saveAdStatus(UUID.randomUUID().toString(), Math.random() < 0.5);
            }
        }
    }

    @Transactional
    public void saveAdStatus(String uuid, boolean status) {
        try {
            AdStatusEntity adStatusEntity = new AdStatusEntity();
            adStatusEntity.setAppId(uuid);
            adStatusEntity.setAppStatus(status);
            getEntityManager().persist(adStatusEntity);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public AdStatusEntity getAdStatusEntity(String uuid) {
        AdStatusEntity adStatusEntity;
        adStatusEntity = (AdStatusEntity)getEntityManager()
            .createQuery("SELECT e FROM AdStatusEntity e WHERE e.appId = :appId")
            .setParameter("appId", uuid)
            .getSingleResult();
        return adStatusEntity;
    }

    private int getAppCount() {
        return getEntityManager()
            .createQuery("select e from AdStatusEntity e")
            .getResultList().size();
    }
}
