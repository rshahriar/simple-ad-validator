package com.widespace.test.models;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created with IntelliJ IDEA. User: rakib Date: 2/16/14 Time: 1:56 AM To change this template use
 * File | Settings | File Templates.
 */
@javax.persistence.Table(name = "ad_status", schema = "", catalog = "widespace")
@Entity
public class AdStatusEntity {

    private String appId;

    @javax.persistence.Column(name = "appId", nullable = false, insertable = true, updatable = true,
                              length = 100, precision = 0)
    @Id
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    private boolean appStatus;

    @javax.persistence.Column(name = "appStatus", nullable = false, insertable = true,
                              updatable = true, length = 0, precision = 0)
    @Basic
    public boolean isAppStatus() {
        return appStatus;
    }

    public void setAppStatus(boolean appStatus) {
        this.appStatus = appStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        AdStatusEntity that = (AdStatusEntity) o;

        if (appStatus != that.appStatus) {
            return false;
        }
        if (appId != null ? !appId.equals(that.appId) : that.appId != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = appId != null ? appId.hashCode() : 0;
        result = 31 * result + (appStatus ? 1 : 0);
        return result;
    }
}
