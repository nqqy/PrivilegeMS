package com.nianququye.domain;

public class Group {
    private Integer groupId;
    private String  groupName;
    private Integer groupLeaderId;
    private Integer groupParentId;
    public Group() {
        super();
    }
    public Group(Integer groupId, String groupName, Integer groupLeaderId, Integer groupParentId) {
        super();
        this.groupId = groupId;
        this.groupName = groupName;
        this.groupLeaderId = groupLeaderId;
        this.groupParentId = groupParentId;
    }
    public String toString() {
        return "Group [groupId=" + groupId + ", groupName=" + groupName + ", groupLeaderId=" + groupLeaderId
                + ", groupParentId=" + groupParentId + "]";
    }
    public Integer getGroupId() {
        return groupId;
    }
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }
    public String getGroupName() {
        return groupName;
    }
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public Integer getGroupLeaderId() {
        return groupLeaderId;
    }
    public void setGroupLeaderId(Integer groupLeaderId) {
        this.groupLeaderId = groupLeaderId;
    }
    public Integer getGroupParentId() {
        return groupParentId;
    }
    public void setGroupParentId(Integer groupParentId) {
        this.groupParentId = groupParentId;
    }
}
