package com.proschan.gameserver.model;

/**
 * Copyright@znt
 * Author:proschan
 * Date:2018/3/24
 * Description:
 */
public class TUser {

    private Long id;
    private String name;
    private String password;
    private String phone;

    @Override
    public String toString() {
        return "TUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public TUser(Long id, String name, String password, String phone) {

        this.id = id;
        this.name = name;
        this.password = password;
        this.phone = phone;
    }
}
