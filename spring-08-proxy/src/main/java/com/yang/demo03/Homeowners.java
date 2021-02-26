package com.yang.demo03;

// 房东
public class Homeowners implements Rent {
    @Override
    public void rent() {
        System.out.println("房东要出租房子！");
    }
}
