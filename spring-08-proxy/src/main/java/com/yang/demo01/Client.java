package com.yang.demo01;

// 租客、客户
public class Client {
    public static void main(String[] args) {
        // 房东出租房子，但不想做多余的事情
        Homeowners homeowners = new Homeowners();
        // 交给中介，中介帮房东出租房(代理房东)
        // 但是代理角色会带有自己的附属操作
        // 若无其他附属操作，这样代理无意义
        Proxy proxy = new Proxy(homeowners);
        // 不用面对房东，而是面对中介
        // 虽然走的是代理，但是最终出粗的还是房东的房子
        proxy.rent();
    }
}
