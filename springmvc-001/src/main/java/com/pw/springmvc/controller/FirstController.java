package com.pw.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {

    @RequestMapping(value = "/")
    public String toIndex(){
        return "index";
    }

    // 请求映射，返回一个String字符串
    //返回值代表的是一个逻辑视图名称
    @RequestMapping(value = "/test")
    public String hehe(){
        return "first";
    }

    @RequestMapping(value = "/haha")
    public String haha(){
        return "other";
    }
}
