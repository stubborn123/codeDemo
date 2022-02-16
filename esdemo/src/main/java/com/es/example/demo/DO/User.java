package com.es.example.demo.DO;

/**
 * @Author: zhangpeng
 * @Date: 2022/2/16 11:03
 */
public class User {

    public String name;

    public Integer age;

    public User(String n, int a){
        name = n;
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
