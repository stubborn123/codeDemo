package com.zp.swagger.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

import static springfox.documentation.builders.RequestHandlerSelectors.any;
import static springfox.documentation.builders.RequestHandlerSelectors.none;

/**
 * @Author: zhangpeng
 * @Date: 2022/2/25 11:01
 */
@Configuration //配置类
@EnableSwagger2// 开启Swagger2的自动配置
public class SwaggerConfig {

//    @Bean
//    public Docket docket() {
//        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
//                //配置是否启用Swagger，如果是false，在浏览器将无法访问
//                //.enable(false); //配置是否启用Swagger，如果是false，在浏览器将无法访问;
//                .select()// 通过.select()方法，去配置扫描接口,RequestHandlerSelectors配置如何扫描接口
//                //.apis(RequestHandlerSelectors.any()) //any就是查询所有，none就是一个都不查
//                .apis(RequestHandlerSelectors.basePackage("com.zp.swagger.demo.controller"))
//                // 配置如何通过path过滤,即这里只扫描请求以/zptest开头的接口
//                //.paths(PathSelectors.ant("/zptest/**"))
//                //同样这里也是path过滤也可以定义条件any()  none()  regex  ant
//                //.paths(PathSelectors.none())
//                .build();
//
//    }


    //配置文档信息
    private ApiInfo apiInfo() {
        Contact contact = new Contact("zp", "http://xxx.xxx.com/联系人访问链接", "1477237223@qq.com");
        return new ApiInfo(
                "Swagger学习", // 标题
                "学习演示如何配置Swagger", // 描述
                "v1.0", // 版本
                "http://terms.service.url/组织链接", // 组织链接
                contact, // 联系人信息
                "Apach 2.0 许可", // 许可
                "许可链接", // 许可连接
                new ArrayList<>()// 扩展
        );
    }


//    @Bean
//    public Docket docket(Environment environment) {
//        // 设置要显示swagger的环境
//        Profiles of = Profiles.of("dev", "test");
//        // 判断当前是否处于该环境
//        // 通过 enable() 接收此参数判断是否要显示
//        boolean b = environment.acceptsProfiles(of);
//
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                .enable(b) //配置是否启用Swagger，如果是false，在浏览器将无法访问
//                .select()// 通过.select()方法，去配置扫描接口,RequestHandlerSelectors配置如何扫描接口
//                .apis(RequestHandlerSelectors.basePackage("com.zp.swagger.demo.controller"))
//                // 配置如何通过path过滤,即这里只扫描请求以/kuang开头的接口
//                .paths(PathSelectors.ant("/zp/**"))
//                .build();
//    }



    @Bean
    public Docket docket1(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("group1");
    }
    @Bean
    public Docket docket2(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("group2");
    }
    @Bean
    public Docket docket3(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("group3");
    }
}
