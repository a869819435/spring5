package com.yang.dao;

import com.yang.entity.User;

import java.util.List;

public interface UserMapper {

    /**
     * 查询用户信息
     * @return
     */
    List<User> queryUser();

    Integer addUser(User user);

    Integer deleteUser(Integer id);

    void testPointCut();
}
