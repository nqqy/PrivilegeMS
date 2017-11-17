package com.nianququye.domain;

import java.util.List;

public class PageBean<T> {
    private Integer offset;     //分页查询起始位置
    private Integer rows;       //每页查询需要数量
    private Integer totalNum;   //完全查询结果数量
    private List<T> entityList; //分页查询泛型结果
    public PageBean() {
        super();
    }
    public PageBean(Integer offset, Integer rows) {
        super();
        this.offset = offset;
        this.rows = rows;
    }
    public PageBean(Integer offset, Integer rows, Integer totalNum, List<T> entityList) {
        super();
        this.offset = offset;
        this.rows = rows;
        this.totalNum = totalNum;
        this.entityList = entityList;
    }
    public String toString() {
        return "PageBean [offset=" + offset + ", rows=" + rows + ", totalNum=" + totalNum + ", entityList=" + entityList
                + "]";
    }
    public Integer getOffset() {
        return offset;
    }
    public void setOffset(Integer offset) {
        this.offset = offset;
    }
    public Integer getRows() {
        return rows;
    }
    public void setRows(Integer rows) {
        this.rows = rows;
    }
    public Integer getTotalNum() {
        return totalNum;
    }
    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }
    public List<T> getEntityList() {
        return entityList;
    }
    public void setEntityList(List<T> entityList) {
        this.entityList = entityList;
    }
}
