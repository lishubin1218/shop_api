package com.aishang.shop_api.po;

import javax.persistence.*;

@Table(name = "shop..category_second")
public class CategorySecond {
    @Id
    @Column(name = "cs_id")
    private Integer csId;

    @Column(name = "cs_name")
    private String csName;

    @Column(name = "c_id")
    private Integer cId;

    /**
     * @return cs_id
     */
    public Integer getCsId() {
        return csId;
    }

    /**
     * @param csId
     */
    public void setCsId(Integer csId) {
        this.csId = csId;
    }

    /**
     * @return cs_name
     */
    public String getCsName() {
        return csName;
    }

    /**
     * @param csName
     */
    public void setCsName(String csName) {
        this.csName = csName;
    }

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
}