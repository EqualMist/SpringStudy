package com.test.aop;

import lombok.extern.java.Log;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
@Log
public class AopTest {

    @Before("execution(* com.test.bean.Student.say(String))")
    public void before(JoinPoint joinPoint) {
        log.info("我是方法执行前的日志" + Arrays.toString(joinPoint.getArgs()));
    }

    @AfterReturning(value = "execution(* com.test.bean.Student.say(String))", returning = "text")
    public void after(Object text) {
        log.info("我是方法执行后的日志，返回值为：" + text);
    }

    @Around("execution(* com.test.bean.Student.say(String))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("我是前置");
        Object result = joinPoint.proceed();
        System.out.println("我是环绕方法");
        return result;
    }

}
