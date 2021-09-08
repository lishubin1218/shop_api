package com.aishang.shop_api.service;

import com.aishang.shop_api.po.Product;
import com.aishang.shop_api.po.ProductExt;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


public interface ProductService {
    //获取商品管理商品
    PageInfo<Product> getProducts(ProductExt productExt);
    //添加商品
    String addProduct(Product product, MultipartFile multipartFile);
    //删除商品
    int delProduct(Integer pId);
    //修改商品
    int updateProduct(Product product);
}
