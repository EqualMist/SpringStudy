package com.test.config;

import com.test.bean.Card;
import com.test.bean.Student;
import org.springframework.context.annotation.*;

@EnableAspectJAutoProxy
@ComponentScans({
        @ComponentScan("com.test.bean"),
        @ComponentScan("com.test.aop")
})
@Configuration
@Import(TestConfiguration.class)
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
