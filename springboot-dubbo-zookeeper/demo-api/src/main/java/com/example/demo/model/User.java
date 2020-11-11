package com.example.demo.model;

import java.io.Serializable;

/**
 * @Author: xiadongming
 * @Date: 2020/11/2 22:08
 * @描述:
 */
public class User implements Serializable {

    private Integer id;

    private String name;

    private String addRess;

    public User(Integer id, String name, String addRess) {
        this.id = id;
        this.name = name;
        this.addRess = addRess;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddRess() {
        return addRess;
    }

    public void setAddRess(String addRess) {
        this.addRess = addRess;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addRess='" + addRess + '\'' +
                '}';
    }
}
