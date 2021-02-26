package com.yang.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 使用注解方式定义AOP
 * @Aspect  标注这类是一个切面
 * @Before("切面位置") 前置增强
 */
@Aspect
public class AnnotationPointCut {

    @Before("execution(* com.yang.service.UserService.*(..))")
    public void before(){
        System.out.println("=====执行方法前");
    }

    @After("execution(* com.yang.service.UserService.*(..))")
    public void after(){
        System.out.println("方法执行后=====");
    }

    /**
     * 在环绕增强中，开业给定一个参数，代表要获取处理切入的点(这个方法的相关信息)
     */
    @Around("execution(* com.yang.service.UserService.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");

        // 获取签名
        System.out.println("Signature:" + jp.getSignature());
        // 执行方法
        Object proceed = jp.proceed();

        System.out.println("环绕后");
        System.out.println(proceed);
    }
}
