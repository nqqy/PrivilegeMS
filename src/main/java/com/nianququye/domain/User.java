package com.nianququye.domain;

public class User {
    private Integer userId;
    private String  userName;
    private String  userPassword;
    private Integer userParentId;
    private Boolean userDeleteState;
    public User() {
        super();
    }
    public User(Integer userId, String userName, String userPassword, Integer userParentId, Boolean userDeleteState) {
        super();
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userParentId = userParentId;
        this.userDeleteState = userDeleteState;
    }
    public String toString() {
        return "User [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword
                + ", userParentId=" + userParentId + ", userDeleteState=" + userDeleteState + "]";
    }
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserPassword() {
        return userPassword;
    }
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    public Integer getUserParentId() {
        return userParentId;
    }
    public void setUserParentId(Integer userParentId) {
        this.userParentId = userParentId;
    }
    public Boolean getUserDeleteState() {
        return userDeleteState;
    }
    public void setUserDeleteState(Boolean userDeleteState) {
        this.userDeleteState = userDeleteState;
    }
}
