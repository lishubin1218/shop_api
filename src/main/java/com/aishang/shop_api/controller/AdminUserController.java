package com.aishang.shop_api.controller;

import com.aishang.shop_api.po.AdminUser;
import com.aishang.shop_api.service.AdminUserService;
import com.aishang.shop_api.util.JWTUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping("/adminUser")
public class AdminUserController {
    @Resource
    AdminUserService adminUserService;


    //登录验证
    @RequestMapping("/login")
    public Map<String, Object> checkUser(@RequestBody  AdminUser adminUser, HttpServletRequest request){
        //获取token
        String token = request.getHeader("Authorization");

        System.out.println(token+"----------token---------");
        System.out.println(adminUser.toString()+"---------adminUser--------");

        AdminUser user = adminUserService.checkUser(adminUser);
        Map<String, Object> map = null;
        if(token != null && !"undefined".equals(token)){
            map = JWTUtil.checkToken(token);
            System.out.println("验证token逻辑------------- ");
        }else{
            //登录成功
            if(user!=null){
                //创建token
                map = JWTUtil.createToken(user);
                System.out.println(map.toString());
            }
        }

        return map;

    }
}
