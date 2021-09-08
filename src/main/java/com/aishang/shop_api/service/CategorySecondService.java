package com.aishang.shop_api.service;

import com.aishang.shop_api.po.CategorySecond;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CategorySecondService {
    //获取二级类目
    List<CategorySecond> getCategorySecond(int cId);
}
