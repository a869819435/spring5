package com.yang.service.impl;

import com.yang.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public void create() {
        System.out.println("增加一个用户");
    }

    @Override
    public void update() {
        System.out.println("修改一个用户");
    }

    @Override
    public void read() {
        System.out.println("查询一个用户");
    }

    @Override
    public void delete() {
        System.out.println("删除一个用户");
    }
}
