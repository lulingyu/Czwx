package com.dk.mp.core.entity;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * 星标用户
 * 作者：janabo on 2016/12/24 15:50
 */
public class XbPersons extends RealmObject {
    @PrimaryKey
    private String prikey;//主键
    private String id;//id
    private String name;//姓名
    private String departmentid;//部门id
    private String departmentname;//部门名称
    private String phones;
    private String loginname;//登录用户

    public String getPrikey() {
        return prikey;
    }

    public void setPrikey(String prikey) {
        this.prikey = prikey;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    public String getPhones() {
        return phones;
    }

    public void setPhones(String phones) {
        this.phones = phones;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }
}
