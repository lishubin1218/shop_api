package com.aishang.shop_api;

import com.aishang.shop_api.intercetper.TokenIntercetper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

//@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Resource
    TokenIntercetper tokenIntercetper;

    //映射路径
    @Value("${file.staticAccessPath}")
    private String staticAccessPath;
    @Value("${file.uploadFolder}")
    private String uploadFolder;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(tokenIntercetper)
//                .addPathPatterns("/**")
//                .excludePathPatterns("/adminUser/login")
//                .excludePathPatterns("/images/**")
//                .excludePathPatterns("/upload/**");

    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry.addResourceHandler(staticAccessPath).addResourceLocations("file:"+uploadFolder);
    }
}
