package com.test.service.serviceImpl;

import com.test.bean.Student;
import com.test.mapper.TestMapper;
import com.test.service.TestService;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Component
public class TestServiceImpl implements TestService {

    @Resource
    TestMapper testMapper;

    @Override
    public List<Student> getStudent() {
        return testMapper.getStudent();
    }

    @Transactional
    @Override
    public void insertStudent(Student student) {
        testMapper.insertStudent(student);
        if (true) {
            throw new RuntimeException("测试事务回滚");
        }
        testMapper.insertStudent(student);
    }
}
