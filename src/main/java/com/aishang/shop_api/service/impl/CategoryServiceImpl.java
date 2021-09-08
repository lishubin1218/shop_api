package com.aishang.shop_api.service.impl;

import com.aishang.shop_api.dao.CategoryMapper;
import com.aishang.shop_api.po.Category;
import com.aishang.shop_api.service.CategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {
    @Resource
    private CategoryMapper categoryMapper;
    //查询一级类目
    @Override
    public List<Category> getCategory() {

        return categoryMapper.getCategory();
    }
}
