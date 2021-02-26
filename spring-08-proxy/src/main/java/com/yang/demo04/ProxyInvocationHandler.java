package com.yang.demo04;

import com.yang.demo03.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 会用这类自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    // 被代理的对象
    private Object target;

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    //    Foo f = (Foo) Proxy.newProxyInstance(Foo.class.getClassLoader(), //类加载器来定义代理类
//            new Class<?>[] { Foo.class }, // 需要代理的代理类的接口列表
//            handler); // 调用处理代理实例的方法

    // 生成得到代理对象
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this);
    }

    // 处理代理实例并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 动态代理的本质 就是使用反射机制实现
        Object result = method.invoke(target,args);
        log(method.getName());
        return result;
    }

    public void log(String msg){
        System.out.println("执行了" + msg + "方法");
    }
}
