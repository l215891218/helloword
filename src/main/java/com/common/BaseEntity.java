package com.common;

import java.io.Serializable;

public abstract class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 实体编号（唯一标识）
     */
    protected String no;


    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }


}
