package com.aishang.shop_api.dao;


import com.aishang.shop_api.po.Order;
import com.aishang.shop_api.po.OrderExt;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface OrderMapper {

    //获取订单集合
    List<OrderExt> getOrders(OrderExt orderExt);
    //获取*状态订单
    List<OrderExt> getStateOrder(OrderExt orderExt);
    //订单详情
    OrderExt orderDetail(Integer oId);
    //修改订单
    void updateOrder(Order order);
    //确认发货
    void confirmOrder(Integer oId);
}