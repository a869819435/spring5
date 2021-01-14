package com.yang.service;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class testUser {

    @Test
    void getUser() {
        // 写好spring容器配置之后这一段代码不需要再使用
//        UserSerivce userSerivce = new UserServiceImpl();
//        userSerivce.getUser();
        // 写好spring容器配置之后使用如下代码，获取ApplicationContext：
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 有容器之后需要什么就get什么
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("userServiceImpl");
        userServiceImpl.getUser();
    }
}