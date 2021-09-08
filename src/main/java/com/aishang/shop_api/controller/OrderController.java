package com.aishang.shop_api.controller;

import com.aishang.shop_api.po.Order;
import com.aishang.shop_api.po.OrderExt;
import com.aishang.shop_api.service.OrderService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/order")

public class OrderController {
    @Resource
    private OrderService orderService;

    //获取订单集合
    @RequestMapping("/getOrders")
    public PageInfo<OrderExt> getOrders(@RequestBody OrderExt orderExt){
        System.out.println("-------分页------");
        System.out.println(orderExt.getPageNow());
        System.out.println(orderExt.getPageSize());
        System.out.println("-------状态------");
        System.out.println(orderExt.getState());
        return orderService.getOrders(orderExt);
    }
    //获取*状态订单
    @RequestMapping("/getStateOrder")
    public PageInfo<OrderExt> getStateOrder(@RequestBody OrderExt orderExt){
        return orderService.getStateOrder(orderExt);
    }
    //订单详情
    @RequestMapping("/orderDetail")
    public OrderExt orderDetail(Integer oId){
        System.out.println("+------------");
        System.out.println(oId);
        return orderService.orderDetail(oId);
    }
    //修改订单
    @RequestMapping("/updateOrder")
    public void updateOrder(@RequestBody Order order){
        System.out.println(order.toString());
        orderService.updateOrder(order);
    }
    //确认发货
    @RequestMapping("/confirmOrder")
    public void confirmOrder(Integer oId){
        System.out.println("------------");
        orderService.confirmOrder(oId);
    }

}
