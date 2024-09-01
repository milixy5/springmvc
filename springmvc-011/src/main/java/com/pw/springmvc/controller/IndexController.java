package com.pw.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index(){
        System.out.println("IndexController index()方法执行");
        return "index";
    }
    @RequestMapping("/ok")
    public String ok(){
        System.out.println("IndexController ok()方法执行");
        return "ok";
    }

}
