package com.widespace.test.responseModels;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class AppStatusResponse {

    @XmlElement(name = "uuid")
    private String appUuid;

    @XmlElement(name = "status")
    private boolean appStatus;

    public AppStatusResponse() {
        // required for XML serialization stuffs
    }

    public AppStatusResponse(String appUuid, boolean appStatus) {
        this.appUuid = appUuid;
        this.appStatus = appStatus;
    }

    public String getAppUuid() {
        return appUuid;
    }

    public boolean isAppStatus() {
        return appStatus;
    }

    public void setAppUuid(String appUuid) {
        this.appUuid = appUuid;
    }

    public void setAppStatus(boolean appStatus) {
        this.appStatus = appStatus;
    }
}
