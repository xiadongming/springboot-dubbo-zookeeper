package com.example.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demo.model.User;
import com.example.demo.server.UserServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author: xiadongming
 * @Date: 2020/11/2 22:19
 * @描述:
 */
@RestController
@RequestMapping("/dev")
public class UserController {

    //指定服务实现类以及版本
    @Reference(version = "1.0.0")
    private UserServer userServer;

    @RequestMapping(value = "/getUserById", method = RequestMethod.GET)
    public User getUserById(Integer id) {
        //调用服务提供的方法
        User userById = userServer.getUserById(88);
        System.out.println("userServer= " + userServer);
        return userById;
    }
}
