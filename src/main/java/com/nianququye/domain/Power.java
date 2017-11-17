package com.nianququye.domain;

public class Power {
    private Integer powerId;
    private Boolean powerAccessPermission;
    private Integer powerAuthorizationLevel;
    public Power() {
        super();
    }
    public Power(Integer powerId, Boolean powerAccessPermission, Integer powerAuthorizationLevel) {
        super();
        this.powerId = powerId;
        this.powerAccessPermission = powerAccessPermission;
        this.powerAuthorizationLevel = powerAuthorizationLevel;
    }
    public String toString() {
        return "Power [powerId=" + powerId + ", powerAccessPermission=" + powerAccessPermission
                + ", powerAuthorizationLevel=" + powerAuthorizationLevel + "]";
    }
    public Integer getPowerId() {
        return powerId;
    }
    public void setPowerId(Integer powerId) {
        this.powerId = powerId;
    }
    public Boolean getPowerAccessPermission() {
        return powerAccessPermission;
    }
    public void setPowerAccessPermission(Boolean powerAccessPermission) {
        this.powerAccessPermission = powerAccessPermission;
    }
    public Integer getPowerAuthorizationLevel() {
        return powerAuthorizationLevel;
    }
    public void setPowerAuthorizationLevel(Integer powerAuthorizationLevel) {
        this.powerAuthorizationLevel = powerAuthorizationLevel;
    }
}
