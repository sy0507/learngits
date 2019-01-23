package com.example.javademo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerController {
//用户登录
    @RequestMapping(value = "/customer/login",method = RequestMethod.POST)
    public String customerLogin(){
        return "login success";
    }
//    新建用户
@RequestMapping(value = "/customer",method = RequestMethod.POST)
public int customer(){
    int id = 1;
    return id;
}
}
