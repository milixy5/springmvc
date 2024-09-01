package com.pw.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/product")
@Controller
public class ProductController {

//    @RequestMapping("/product/detail")
    @RequestMapping("/detail")
    public String productDetail(){
        return "product_detail";
    }

    @RequestMapping("/x*z")
    public String test(){
        return "ok";
    }
}
