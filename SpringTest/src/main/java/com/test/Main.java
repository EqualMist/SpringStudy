package com.test;

import com.test.bean.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("test.xml");

//        Student student = (Student) context.getBean(Student.class);
        Student student = (Student) context.getBean("student");
//        Student student2 = (Student) context.getBean("student");


        System.out.println(student);
//        System.out.println(student2);

        context.close();
    }
}
