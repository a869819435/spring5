package com.yang.service;

import com.yang.dao.UserDao;
import com.yang.dao.UserDaoImpl;

public class UserServiceImpl implements UserSerivce{

    private UserDao userDao;

    // 利用set进行动态值的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
