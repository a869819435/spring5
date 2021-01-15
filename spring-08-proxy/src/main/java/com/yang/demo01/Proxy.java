package com.yang.demo01;

// 中介，代理
public class Proxy implements Rent {
    // 少用继承，采用这种组合的方式获取房东
    private Homeowners homeowners;

    public Proxy() {
    }

    public Proxy(Homeowners homeowners) {
        this.homeowners = homeowners;
    }

    @Override
    public void rent() {
        // 中间带你看房
        findHouse();
        // 帮房东出租房子
        homeowners.rent();
        // 中介带你签合同
        signTheContract();
        // 收中介费
        collectFee();
    }

    public void findHouse(){
        System.out.println("中介带你看房！");
    }

    public void signTheContract(){
        System.out.println("签租房合同");
    }

    // 收中介费
    public void collectFee(){
        System.out.println("收中介费");
    }
}
