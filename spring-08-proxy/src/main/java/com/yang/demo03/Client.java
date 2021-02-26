package com.yang.demo03;

public class Client {
    public static void main(String[] args) {
        // 真实角色
        Homeowners homeowners = new Homeowners();

        // 代理角色：暂时没有
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        // 通过调用程序处理角色来处理要调用的接口对象
        pih.setRent(homeowners);
        // 这里的rent就是动态生成的，并没有写它
        Rent rent = (Rent) pih.getProxy();
        rent.rent();

    }
}
