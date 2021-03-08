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
    /**
     * @Transactional
     *   *     开启注解事务配置，一个 @Transactional只能对当前类有效,当前类下面所有方法配置一样
     *   *  isolation=Isolation.REPEATABLE_READ, 隔离级别
     *      propagation=Propagation.REQUIRED, 传播行为（规则）
     *      timeout=5, 超时时间
     *      readOnly=true  是否是只读事务
     */
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
