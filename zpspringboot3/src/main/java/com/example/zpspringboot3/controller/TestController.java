package com.example.zpspringboot3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Map;

/**
 * @Author: zhangpeng
 * @Date: 2022/2/21 16:02
 */
@Controller
public class TestController {

//    @RequestMapping("/t1")
//    public String test1(){
//        //classpath:/templates/test.html
//        return "text";
//    }



    @RequestMapping("/t1")
    public String test1(Model model){
        //存入数据
        model.addAttribute("msg","Hello,Thymeleaf");
        //classpath:/templates/test.html
        return "text2";
    }


    @RequestMapping("/t2")
    public String test2(Map<String,Object> map){
        //存入数据
        map.put("msg","<h1>Hello</h1>");
        map.put("users", Arrays.asList("zp","zhangpeng"));
        //classpath:/templates/test.html
        return "text3";
    }
}
