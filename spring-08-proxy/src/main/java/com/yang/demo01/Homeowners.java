package com.yang.demo01;

// 房东
public class Homeowners implements Rent{
    @Override
    public void rent() {
        System.out.println("房东要出租房子！");
    }
}
