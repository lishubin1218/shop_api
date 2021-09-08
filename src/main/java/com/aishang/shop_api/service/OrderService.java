package com.aishang.shop_api.service;

import com.aishang.shop_api.po.Order;
import com.aishang.shop_api.po.OrderExt;
import com.github.pagehelper.PageInfo;

import java.util.Arrays;

public interface OrderService {
    //获取所有订单
    PageInfo<OrderExt> getOrders(OrderExt orderExt);
    //获取*状态订单
    PageInfo<OrderExt> getStateOrder(OrderExt orderExt);
    //订单详情
    OrderExt orderDetail(Integer oId);
    //修改订单
    void updateOrder(Order order);
    //确认发货
    void confirmOrder(Integer oId);
}
