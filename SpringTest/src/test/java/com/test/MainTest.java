package com.test;

import com.test.config.MainConfiguration;
import com.test.service.TestService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {MainConfiguration.class})
public class MainTest {

    @Autowired
    TestService testService;

    @Test
    public void test() {
        testService.getStudent();
    }
}
