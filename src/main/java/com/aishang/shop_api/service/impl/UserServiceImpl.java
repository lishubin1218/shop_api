package com.aishang.shop_api.service.impl;

import com.aishang.shop_api.dao.UserMapper;
import com.aishang.shop_api.po.User;
import com.aishang.shop_api.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;
    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }
}
