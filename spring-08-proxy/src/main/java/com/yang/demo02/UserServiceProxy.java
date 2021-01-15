package com.yang.demo02;

public class UserServiceProxy implements UserService{

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void create() {
        log("create");
        userService.create();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void read() {
        log("read");
        userService.read();
    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    public void log(String msg){
        System.out.println("执行了" + msg + "方法");
    }
}
