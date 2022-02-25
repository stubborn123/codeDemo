package com.zp.swagger.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhangpeng
 * @Date: 2022/2/25 10:52
 */
@RestController
//@RequestBody+@Controller 这个注解对于指定页面跳转不行但是返回数据很友好，自动转成JSON格式
@RequestMapping("swagger")
public class HelloController {


    @RequestMapping("hello")
    public String sayHello(){
        return "hello swagger";
    }
}
