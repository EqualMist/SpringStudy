package com.test.aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

public class AopAdviceAfter implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("方法名称为：" + method.getName());
        System.out.println("方法参数有："+ Arrays.toString(args));
        System.out.println("方法执行对象为：" + target);
        System.out.println("方法返回值为：" + returnValue);
    }
}
