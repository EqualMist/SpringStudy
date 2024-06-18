package com.test;


import com.test.bean.Student;
import com.test.config.MainConfiguration;
import com.test.service.TestService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfiguration.class)) {
            TestService testService = context.getBean(TestService.class);
            Student student = new Student();
            student.setName("爱丽希雅");
            student.setSex("女");
            student.setGrade(2021);
            testService.insertStudent(student);
        }
    }
}
