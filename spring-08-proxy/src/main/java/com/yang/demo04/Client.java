package com.yang.demo04;

import com.yang.demo02.UserService;
import com.yang.demo02.UserServiceImpl;
import com.yang.demo03.Homeowners;
import com.yang.demo03.Rent;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        // 生成代理类的类
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        // 设置要被代理的对象
        pih.setTarget(userServiceImpl);
        UserService userService = (UserService) pih.getProxy();
        userService.create();

        Homeowners homeowners = new Homeowners();
        // 设置要被代理的对象
        pih.setTarget(homeowners);
        Rent rent = (Rent) pih.getProxy();
        rent.rent();
    }
}
