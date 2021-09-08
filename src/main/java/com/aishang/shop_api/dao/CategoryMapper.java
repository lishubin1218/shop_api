package com.aishang.shop_api.dao;

import com.aishang.shop_api.po.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface CategoryMapper {
    //查询一级类目
    List<Category> getCategory();
}