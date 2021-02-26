package com.yang.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 会用这类自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    // 被代理的接口
    private Rent rent;

    public Rent getRent() {
        return rent;
    }

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    //    Foo f = (Foo) Proxy.newProxyInstance(Foo.class.getClassLoader(), //类加载器来定义代理类
//            new Class<?>[] { Foo.class }, // 需要代理的代理类的接口列表
//            handler); // 调用处理代理实例的方法

    // 生成得到代理对象
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                rent.getClass().getInterfaces(),
                this);
    }

    // 处理代理实例并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 动态代理的本质 就是使用反射机制实现
        seeHouse();
        Object result = method.invoke(rent,args);
        fareHouse();
        return result;
    }

    private void seeHouse(){
        System.out.println("中介带你看房子");
    }

    private void fareHouse(){
        System.out.println("收中介费");
    }
}
