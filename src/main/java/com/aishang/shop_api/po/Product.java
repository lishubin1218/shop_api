package com.aishang.shop_api.po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "shop..product")
public class Product {
    @Id
    @Column(name = "p_id")
    private Integer pId;

    @Column(name = "p_name")
    private String pName;

    @Column(name = "market_price")
    private Double marketPrice;

    @Column(name = "shop_price")
    private Double shopPrice;

    private String image;

    @Column(name = "p_desc")
    private String pDesc;

    @Column(name = "is_hot")
    private Integer isHot;

    @Column(name = "p_date")
    private Date pDate;

    @Column(name = "cs_id")
    private Integer csId;

    @Override
    public String toString() {
        return "Product{" +
                "pId=" + pId +
                ", pName='" + pName + '\'' +
                ", marketPrice=" + marketPrice +
                ", shopPrice=" + shopPrice +
                ", image='" + image + '\'' +
                ", pDesc='" + pDesc + '\'' +
                ", isHot=" + isHot +
                ", pDate=" + pDate +
                ", csId=" + csId +
                '}';
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
     * @return p_name
     */
    public String getpName() {
        return pName;
    }

    /**
     * @param pName
     */
    public void setpName(String pName) {
        this.pName = pName;
    }

    /**
     * @return market_price
     */
    public Double getMarketPrice() {
        return marketPrice;
    }

    /**
     * @param marketPrice
     */
    public void setMarketPrice(Double marketPrice) {
        this.marketPrice = marketPrice;
    }

    /**
     * @return shop_price
     */
    public Double getShopPrice() {
        return shopPrice;
    }

    /**
     * @param shopPrice
     */
    public void setShopPrice(Double shopPrice) {
        this.shopPrice = shopPrice;
    }

    /**
     * @return image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * @return p_desc
     */
    public String getpDesc() {
        return pDesc;
    }

    /**
     * @param pDesc
     */
    public void setpDesc(String pDesc) {
        this.pDesc = pDesc;
    }

    /**
     * @return is_hot
     */
    public Integer getIsHot() {
        return isHot;
    }

    /**
     * @param isHot
     */
    public void setIsHot(Integer isHot) {
        this.isHot = isHot;
    }

    /**
     * @return p_date
     */
    public Date getpDate() {
        return pDate;
    }

    /**
     * @param pDate
     */
    public void setpDate(Date pDate) {
        this.pDate = pDate;
    }

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
}