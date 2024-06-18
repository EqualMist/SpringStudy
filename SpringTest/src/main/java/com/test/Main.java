package com.test;

import com.test.bean.Card;
import com.test.bean.Student;
import com.test.config.MainConfiguration;
import com.test.mapper.TestMapper;
import com.test.service.TestService;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfiguration.class)) {
            TestService testService = context.getBean(TestService.class);
            System.out.println(testService.getStudent());
        }
    }
}
