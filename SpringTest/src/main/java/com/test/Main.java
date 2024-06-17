package com.test;

import com.test.bean.Card;
import com.test.bean.Student;
import com.test.config.MainConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfiguration.class)) {
            Card card = context.getBean(Card.class);
            System.out.println(card);
        }
    }
}
