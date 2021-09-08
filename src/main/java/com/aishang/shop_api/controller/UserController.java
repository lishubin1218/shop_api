package com.aishang.shop_api.controller;

import com.aishang.shop_api.po.User;
import com.aishang.shop_api.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {
    @Resource
    UserService userService;
    @RequestMapping("/i")
    public String index(){
        return "index";
    }
    //没用
    @RequestMapping("/user")
    public List<User> getAll(){
        List<User> list = userService.getAll();
        System.out.println(list.toString());
        return list;
    }
}
