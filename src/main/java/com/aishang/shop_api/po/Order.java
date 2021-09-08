package com.aishang.shop_api.po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "shop..order")
public class Order {
    @Id
    @Column(name = "o_id")
    private Integer oId;

    private Double total;

    @Column(name = "order_time")
    private Date orderTime;

    private Integer state;

    private String name;

    private String phone;

    private String addr;

    @Override
    public String toString() {
        return "Order{" +
                "oId=" + oId +
                ", total=" + total +
                ", orderTime=" + orderTime +
                ", state=" + state +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", addr='" + addr + '\'' +
                ", uId=" + uId +
                '}';
    }

    @Column(name = "u_id")
    private Integer uId;

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

    /**
     * @return total
     */
    public Double getTotal() {
        return total;
    }

    /**
     * @param total
     */
    public void setTotal(Double total) {
        this.total = total;
    }

    /**
     * @return order_time
     */
    public Date getOrderTime() {
        return orderTime;
    }

    /**
     * @param orderTime
     */
    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    /**
     * @return state
     */
    public Integer getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return addr
     */
    public String getAddr() {
        return addr;
    }

    /**
     * @param addr
     */
    public void setAddr(String addr) {
        this.addr = addr;
    }

    /**
     * @return u_id
     */
    public Integer getuId() {
        return uId;
    }

    /**
     * @param uId
     */
    public void setuId(Integer uId) {
        this.uId = uId;
    }
}