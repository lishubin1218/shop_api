package com.aishang.shop_api.service;

import com.aishang.shop_api.po.AdminUser;

public interface AdminUserService {
    //登录验证
    AdminUser checkUser(AdminUser adminUser);
    //token验证用户
    AdminUser selectUserById(String id);
}
