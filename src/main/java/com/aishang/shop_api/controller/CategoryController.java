package com.aishang.shop_api.controller;

import com.aishang.shop_api.po.Category;
import com.aishang.shop_api.po.ProductExt;
import com.aishang.shop_api.service.impl.CategoryServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Resource
    private CategoryServiceImpl categoryService;
    //获取一级类目
    @RequestMapping("/getCategory")
    public List<Category> getCategory(){
        return categoryService.getCategory();
    }
}
