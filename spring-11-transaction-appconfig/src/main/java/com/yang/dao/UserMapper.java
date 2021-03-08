package com.yang.dao;

import com.yang.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface UserMapper {

    /**
     * 查询用户信息
     * @return
     */
    List<User> queryUser();

    Integer addUser(User user);

    Integer deleteUser(Integer id);
}
