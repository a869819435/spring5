package com.yang.demo02;

public class Client {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService(userService);

        proxy.create();
        proxy.update();
        proxy.read();
        proxy.delete();
    }
}
