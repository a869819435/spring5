package com.yang.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeLog implements MethodBeforeAdvice {

    // method: 要执行的目标对象的方法
    // objects: 参数
    // target: 目标对象
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("准备执行" + target.getClass().getName()
                + "的" + method.getName());
    }
}
