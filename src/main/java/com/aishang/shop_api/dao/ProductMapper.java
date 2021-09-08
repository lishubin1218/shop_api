package com.aishang.shop_api.dao;


import com.aishang.shop_api.po.Product;
import com.aishang.shop_api.po.ProductExt;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ProductMapper {
    //获取商品管理商品
    List<Product> getProducts(ProductExt productExt);
    //添加商品
    @Insert("insert into product values(default,#{pName},#{marketPrice},#{shopPrice},#{image},#{pDesc},#{isHot},#{pDate},#{csId})")
    void addProduct(Product product);
    //删除商品
    Integer delProduct(Integer pId);
    //修改商品
    int updateProduct(Product product);
}
