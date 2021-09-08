package com.aishang.shop_api.dao;


import com.aishang.shop_api.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface UserMapper {
    @Select("select * from user")
    List<User> getAll();
}