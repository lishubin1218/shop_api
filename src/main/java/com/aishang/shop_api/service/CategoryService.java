package com.aishang.shop_api.service;

import com.aishang.shop_api.po.Category;
import com.aishang.shop_api.po.CategorySecond;

import java.util.List;

public interface CategoryService {
    //查询一级类目
    List<Category> getCategory();
}
