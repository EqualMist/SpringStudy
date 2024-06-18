package com.test.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@Data
@Component
public class Student {
    int id;
    int sid;
    String name;
    String sex;
    int grade;
    int age;



}
