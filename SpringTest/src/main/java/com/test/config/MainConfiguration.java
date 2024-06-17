package com.test.config;

import com.test.bean.Card;
import com.test.bean.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@ComponentScan("com.test.bean")
@Configuration
public class MainConfiguration {

//    @Bean
//    @Scope("prototype")
//    public Card card() {
//        return new Card();
//    }
//
//    @Bean
//    public Student student() {
//        return new Student();
//    }
}
