package com.test.aop;

import lombok.extern.java.Log;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Arrays;

@Log
public class AopTest {

    public void before() {
        log.info("我是方法执行前的日志");
    }

    public void after(JoinPoint joinPoint) {
        System.out.println(Arrays.toString(joinPoint.getArgs()));
        log.info("我是方法执行后的日志");
    }

    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("我是前置");
        Object result = joinPoint.proceed();
        System.out.println("我是环绕方法");
    }

}
