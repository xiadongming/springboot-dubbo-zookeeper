package com.example.demo.server;

import com.example.demo.model.User;

/**
 * @Author: xiadongming
 * @Date: 2020/11/2 22:07
 * @描述:
 */
public interface UserServer {
    /**根据id查询user*/
    User getUserById(Integer id);
}
