package com.test.bean;

import javax.annotation.PostConstruct;

public class TestBean {

    @PostConstruct
    public void init() {
        System.out.println("TestBean is initialized");
    }
}
