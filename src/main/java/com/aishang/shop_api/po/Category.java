package com.aishang.shop_api.po;

import javax.persistence.*;

@Table(name = "shop..category")
public class Category {
    @Id
    @Column(name = "c_id")
    private Integer cId;

    @Column(name = "c_name")
    private String cName;

    /**
     * @return c_id
     */
    public Integer getcId() {
        return cId;
    }

    /**
     * @param cId
     */
    public void setcId(Integer cId) {
        this.cId = cId;
    }

    /**
     * @return c_name
     */
    public String getcName() {
        return cName;
    }

    /**
     * @param cName
     */
    public void setcName(String cName) {
        this.cName = cName;
    }
}