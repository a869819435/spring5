package com.yang.service;

import com.yang.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    /**
     * 查询用户信息
     * @return
     */
    List<User> queryUser();

    Integer addUser(User user);

    Integer deleteUser(Integer id);

    void testPointCut();
}
