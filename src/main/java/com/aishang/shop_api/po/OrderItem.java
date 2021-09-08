package com.aishang.shop_api.po;

import javax.persistence.*;

@Table(name = "shop..order_item")
public class OrderItem {
    @Id
    @Column(name = "item_id")
    private Integer itemId;

    private Integer count;

    @Column(name = "sub_total")
    private Double subTotal;

    @Column(name = "p_id")
    private Integer pId;

    @Column(name = "o_id")
    private Integer oId;

    /**
     * @return item_id
     */
    public Integer getItemId() {
        return itemId;
    }

    /**
     * @param itemId
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    /**
     * @param count
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * @return sub_total
     */
    public Double getSubTotal() {
        return subTotal;
    }

    /**
     * @param subTotal
     */
    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    /**
     * @return p_id
     */
    public Integer getpId() {
        return pId;
    }

    /**
     * @param pId
     */
    public void setpId(Integer pId) {
        this.pId = pId;
    }

    /**
     * @return o_id
     */
    public Integer getoId() {
        return oId;
    }

    /**
     * @param oId
     */
    public void setoId(Integer oId) {
        this.oId = oId;
    }
}