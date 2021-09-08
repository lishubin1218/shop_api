package com.aishang.shop_api.service.impl;

import com.aishang.shop_api.dao.AdminUserMapper;
import com.aishang.shop_api.po.AdminUser;
import com.aishang.shop_api.service.AdminUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminUserServiceImpl implements AdminUserService {
    @Resource
    private AdminUserMapper adminUserMapper;
    //登录验证
    @Override
    public AdminUser checkUser(AdminUser adminUser) {
        return adminUserMapper.checkUser(adminUser);
    }
    //查询用户信息
    @Override
    public AdminUser selectUserById(String id) {
        return adminUserMapper.selectUserById(id);
    }
}
