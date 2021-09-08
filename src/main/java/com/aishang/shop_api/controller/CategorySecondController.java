package com.aishang.shop_api.controller;

import com.aishang.shop_api.po.CategorySecond;
import com.aishang.shop_api.service.CategorySecondService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/categorySecond")
public class CategorySecondController {
    @Resource
    private CategorySecondService categorySecondService;
    //获取二级类目
    @RequestMapping("/getCategorySecond")
    public List<CategorySecond> getCategorySecond(int cId){
        return categorySecondService.getCategorySecond(cId);
    }
}
