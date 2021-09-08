package com.aishang.shop_api.service.impl;

import com.aishang.shop_api.dao.CategorySecondMapper;
import com.aishang.shop_api.po.CategorySecond;
import com.aishang.shop_api.service.CategorySecondService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CategorySecondServiceImpl implements CategorySecondService {
    @Resource
    private CategorySecondMapper categorySecondMapper;
    //查询二级类目
    @Override
    public List<CategorySecond> getCategorySecond(int cId) {
        return categorySecondMapper.getCategorySecond(cId);
    }
}
