package com.example.demo.server.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.demo.model.User;
import com.example.demo.server.UserServer;

/**
 * @Author: xiadongming
 * @Date: 2020/11/2 22:13
 * @描述:
 */
//对外暴露为dubbo服务，注意，这个@service为dubbo的@service,版本号可不要，或者自定义
@Service(version = "1.0.0")
public class UserServiceImpl implements UserServer {
    @Override
    public User getUserById(Integer id) {
        return new User(id, "汪汪啊辛苦了", "郑州");
    }
}
