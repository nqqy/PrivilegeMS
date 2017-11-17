package com.nianququye.domain;

public class Role {
    private Integer roleId;
    private String  roleName;
    private Integer roleParentId;
    public Role() {
        super();
    }
    public Role(Integer roleId, String roleName, Integer roleParentId) {
        super();
        this.roleId = roleId;
        this.roleName = roleName;
        this.roleParentId = roleParentId;
    }
    public String toString() {
        return "Role [roleId=" + roleId + ", roleName=" + roleName + ", roleParentId=" + roleParentId + "]";
    }
    public Integer getRoleId() {
        return roleId;
    }
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
    public String getRoleName() {
        return roleName;
    }
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    public Integer getRoleParentId() {
        return roleParentId;
    }
    public void setRoleParentId(Integer roleParentId) {
        this.roleParentId = roleParentId;
    }
}
