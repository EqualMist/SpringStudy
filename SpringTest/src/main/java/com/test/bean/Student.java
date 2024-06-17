package com.test.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@Component
public class Student {

    String name;
    int age;
    @Resource
    Card card;

    @PostConstruct
    public void init() {
        System.out.println("Student init method, card:" + card);
    }

    public Student() {
        System.out.println("Student constructor called");
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void destroy() {
        System.out.println("Student destroy method");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Card getCard() {
        return card;
    }

    @Autowired
    public void setCard(Card card) {
        System.out.println("Set card called:" + card);
        this.card = card;
    }

    public void say(String text) {
        System.out.println("Hello, I am a student, my name is " + name + ", my age is:" + age + ", I said:" + text);
    }

    @Deprecated
    public void deprecatedMethod() {
        System.out.println("Deprecated method");
    }
}
