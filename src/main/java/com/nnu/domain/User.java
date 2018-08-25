package com.nnu.domain;

public class User {
    private Integer userid;

    private String username;

    private String password;

    private Integer category;
    /*
    0 总经理
    1 招商部
    2 办公室
    3 财务部
    4 物业部
     */

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }
}