package com.proschan.gameserver.model;

import java.util.Date;

/**
 * Copyright@znt
 * Author:proschan
 * Date:2018/3/10
 * Description:
 */
public class User {
    private Long id;
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
