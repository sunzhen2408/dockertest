package com.example.dockertest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//alt enter 自动导包
//设置auto import https://blog.csdn.net/hxpjava1/article/details/78135934
//@RestController  返回json
//@Controller 返回controller
@Controller
public class testcontroller {
    @RequestMapping("/")
    public String greeting(){
        return "index";
    }
    @RequestMapping("/jsp")
    public String testjsp(){
        //https://blog.csdn.net/shijiebei2009/article/details/44726433 快捷键
        //sout
        System.out.println("suceed");
        return "index";
    }
}
