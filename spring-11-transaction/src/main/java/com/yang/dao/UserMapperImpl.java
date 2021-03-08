package com.yang.dao;

import com.yang.entity.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {

    @Override
    public List<User> queryUser(){
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        return mapper.queryUser();
    }

    @Override
    public Integer addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public Integer deleteUser(Integer id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }

    @Override
    public void testPointCut(){
        UserMapper userMapper = getSqlSession().getMapper(UserMapper.class);
        List<User> userList = userMapper.queryUser();
        userList.forEach(System.out::println);
        User user = new User(4,"xiao","123456");
        userMapper.addUser(user);
        userMapper.deleteUser(4);
        userList = userMapper.queryUser();
        userList.forEach(System.out::println);
    }
}
