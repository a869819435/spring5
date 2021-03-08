package com.yang.service.impl;

import com.yang.dao.UserMapper;
import com.yang.entity.User;
import com.yang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryUser(){
        return userMapper.queryUser();
    }

    @Override
    public Integer addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public Integer deleteUser(Integer id) {
        return userMapper.deleteUser(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void testPointCut(){
        List<User> userList = userMapper.queryUser();
        userList.forEach(System.out::println);
        User user = new User(4,"xiao","123456");
        userMapper.addUser(user);
        userMapper.deleteUser(4);
        userList = userMapper.queryUser();
        userList.forEach(System.out::println);
    }
}
