package com.aishang.shop_api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test {
    @RequestMapping("/totest")
    public String totest(Model model){
        model.addAttribute("username", "tom");
        System.out.println("去测试页面");
        return "test";
    }

}
