package com.aishang.shop_api.po;

import java.util.List;

public class OrderExt extends Order {
    //分页数据
    private int pageNow;
    private int pageSize;
    //订单集合
    private List<Order> orderList;
//    订单项集合
    private List<OrderItemExt> orderItemExtList;

    public List<OrderItemExt> getOrderItemExtList() {
        return orderItemExtList;
    }

    public void setOrderItemExtList(List<OrderItemExt> orderItemExtList) {
        this.orderItemExtList = orderItemExtList;
    }

    public int getPageNow() {
        return pageNow;
    }

    public void setPageNow(int pageNow) {
        this.pageNow = pageNow;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }


}


