package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("test.xml");
    }
}
