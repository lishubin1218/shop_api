package com.aishang.shop_api.service.impl;

import com.aishang.shop_api.dao.ProductMapper;
import com.aishang.shop_api.po.Product;
import com.aishang.shop_api.po.ProductExt;
import com.aishang.shop_api.service.ProductService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductMapper productMapper;
    @Value("${file.uploadFolder}")
    private String uploadFolder;

    //获取商品管理商品
    @Override
    public PageInfo<Product> getProducts(ProductExt productExt) {
        //设置分页数据
        PageHelper.startPage(productExt.getPageNow(),productExt.getPageSize());
        //查询商品
        List<Product> products = productMapper.getProducts(productExt);
        //把集合放到PageInfo里面
        PageInfo<Product> productPageInfo = new PageInfo<Product>(products,7);


        return productPageInfo;
    }
    //添加商品
    @Transactional
    @Override
    public String addProduct(Product product, MultipartFile multipartFile) {
        //返回成功失败
        String isUpload="ok";
        //切割地址
        String uuidUpload = UUID.randomUUID().toString().replaceAll("-","")+"-" + multipartFile.getOriginalFilename();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(new Date());
        File file = new File(uploadFolder + format);
        if(!file.exists()){
            file.mkdirs();
        }
        file = new File( uploadFolder+ format +"/"+ uuidUpload);
        //存入图片
        try {
            String path = file.getPath();
            String[] uploads = path.split("upload");
            String upload = uploads[1];
            System.out.println(uploadFolder+upload);
            System.out.println(upload+ "upload");
            product.setImage("upload" +upload);
            product.setpDate(new Date());
//            int a= 1/0;
            productMapper.addProduct(product);
            multipartFile.transferTo(file);

        }catch (Exception e){
            file.delete();
            isUpload = "no";
            throw new RuntimeException("上传失败");
        }finally {
            return isUpload;
        }
    }
    //删除商品
    @Override
    public int delProduct(Integer pId) {
        int res = productMapper.delProduct(pId);
        System.out.println(res+"+++++++++++++++++++++++++++++++++");
        return res;
    }
    //修改商品
    @Override
    public int updateProduct(Product product) {
        String pDesc = product.getpDesc();
        Double marketPrice = product.getMarketPrice();
        Double shopPrice = product.getShopPrice();
        String pName = product.getpName();
        //非空
        if("".equals(pDesc)||"".equals(pName)||"".equals(marketPrice)||"".equals(shopPrice)){
            return 0;
        }
        //修改后的时间
        product.setpDate(new Date());
        return productMapper.updateProduct(product);
    }
}
