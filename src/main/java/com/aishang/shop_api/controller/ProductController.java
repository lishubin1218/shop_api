package com.aishang.shop_api.controller;

import com.aishang.shop_api.po.Product;
import com.aishang.shop_api.po.ProductExt;
import com.aishang.shop_api.service.ProductService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Resource
    private ProductService productService;
    @Value("${file.uploadFolder}")
    private String uploadFolder;

    //获取商品管理商品
    @RequestMapping("/getProducts")
    public PageInfo<Product> getProducts(@RequestBody  ProductExt productExt){
        System.out.println(productExt.toString()+"-----------------------");
        //获取商品
        PageInfo<Product> list = productService.getProducts(productExt);
        return list;
    }
    //添加商品
    @RequestMapping("/addProduct")
    public String addProduct(Product product,@RequestParam("file") MultipartFile multipartFile) {
        return productService.addProduct(product,multipartFile);
    }
    //删除商品
    @RequestMapping("/delProduct")
    public int delProduct(Integer pId){
        int integer = productService.delProduct(pId);
        return  integer;
    }
    //修改商品
    @RequestMapping("/updateProduct")
    public int updateProduct(@RequestBody Product product){
        int res = productService.updateProduct(product);
        return  res;
    }
}
