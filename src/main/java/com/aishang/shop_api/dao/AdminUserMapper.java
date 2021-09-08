package com.aishang.shop_api.dao;

import com.aishang.shop_api.po.AdminUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminUserMapper {
    //登陆验证
    AdminUser checkUser(AdminUser adminUser);
    //查询用户信息
    AdminUser selectUserById(String id);
}