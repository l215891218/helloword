package com.hello.entity;


import com.common.BaseEntity;

public class User extends BaseEntity {

    private String loginName;
    private String loginPassword;
    private String remame;
    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getRemame() {
        return remame;
    }

    public void setRemame(String remame) {
        this.remame = remame;
    }
}
