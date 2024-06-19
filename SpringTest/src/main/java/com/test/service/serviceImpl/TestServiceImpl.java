package com.test.service.serviceImpl;

import com.test.bean.Student;
import com.test.mapper.TestMapper;
import com.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.List;

@Component
public class TestServiceImpl implements TestService {

    TestMapper testMapper;

    public TestServiceImpl() {
        System.out.println("TestServiceImpl constructor");
    }

    @PostConstruct
    public void init() {
        System.out.println("TestServiceImpl init");
    }

    @Autowired
    public void setTestMapper(TestMapper testMapper) {
        System.out.println("我是依赖注入");
        this.testMapper = testMapper;
    }

    @Override
    public List<Student> getStudent() {
        return testMapper.getStudent();
    }

    @Transactional
    @Override
    public void insertStudent(Student student) {
        testMapper.insertStudent(student);
    }
}
