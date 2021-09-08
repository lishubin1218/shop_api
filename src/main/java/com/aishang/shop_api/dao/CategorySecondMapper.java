package com.aishang.shop_api.dao;


import com.aishang.shop_api.po.CategorySecond;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface CategorySecondMapper {
    //获取二级类目
    List<CategorySecond> getCategorySecond(int cId);
}