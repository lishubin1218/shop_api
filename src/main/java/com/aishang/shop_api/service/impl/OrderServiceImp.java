package com.aishang.shop_api.service.impl;

import com.aishang.shop_api.dao.OrderMapper;
import com.aishang.shop_api.po.Order;
import com.aishang.shop_api.po.OrderExt;
import com.aishang.shop_api.service.OrderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImp implements OrderService {
    @Resource
    private OrderMapper orderMapper;
    //获取订单集合
    @Override
    public PageInfo<OrderExt> getOrders(OrderExt orderExt) {
        //设置分页
        PageHelper.startPage(orderExt.getPageNow(), orderExt.getPageSize());

        //查询数据库
        List<OrderExt> orderExts = orderMapper.getOrders(orderExt);
        //new PageInfo
        PageInfo<OrderExt> orderExtPageInfo = new PageInfo<OrderExt>(orderExts, 7);

        return orderExtPageInfo;
    }
    //获取*状态订单
    @Override
    public PageInfo<OrderExt> getStateOrder(OrderExt orderExt) {
        PageHelper.startPage(orderExt.getPageNow(),orderExt.getPageSize());
        List<OrderExt> orderExtList = orderMapper.getStateOrder(orderExt);
        PageInfo<OrderExt> orderExtPageInfo = new PageInfo<>(orderExtList, 7);
        return orderExtPageInfo;
    }
    //订单详情
    @Override
    public OrderExt orderDetail(Integer oId) {
        return orderMapper.orderDetail(oId);
    }
    //修改订单
    @Override
    public void updateOrder(Order order) {
        orderMapper.updateOrder(order);
    }
    //确认发货
    @Override
    public void confirmOrder(Integer oId) {
        orderMapper.confirmOrder(oId);
    }


}
