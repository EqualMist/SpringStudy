package com.test.bean;

public class Student {

    String name;
    int age;

    public void init() {
        System.out.println("Student init method");
    }

    public Student() {
        System.out.println("Student Constructor");
    }

    public void destroy() {
        System.out.println("Student destroy method");
    }

}
