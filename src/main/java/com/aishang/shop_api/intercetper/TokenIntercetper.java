package com.aishang.shop_api.intercetper;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class TokenIntercetper implements HandlerInterceptor {
    //拦截方法

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("拦截器");
        String requestURI = request.getRequestURI();
        System.out.println(requestURI);
        //请求头获取Token
        String token = request.getHeader("authorization");
        if(token!=null){
            System.out.println("拦截器-------------放行");
            return true;
        }else if(requestURI.contains("upload")){
            return true;
        }else if(requestURI.contains("userImages")){
            return true;
        }


        if(token!=null){
            System.out.println("拦截器-------------放行");
            return true;
        }
        response.getWriter().print("not login");
        return false;
    }
}
