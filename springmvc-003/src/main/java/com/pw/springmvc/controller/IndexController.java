package com.pw.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/login/{username}/{password}")
    public String testRestful(@PathVariable("username") String username, @PathVariable("password") String password){
        System.out.println("username: "+username+" "+"password: "+password);
        return "ok";
    }

    @RequestMapping(value = "/user/login",method = RequestMethod.POST)
    public String userLogin(){
        System.out.println("正在处理登录的业务……");
        return "ok";
    }
}
