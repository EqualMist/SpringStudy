package com.test.service.serviceImpl;

import com.test.bean.Student;
import com.test.mapper.TestMapper;
import com.test.service.TestService;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

@Component
public class TestServiceImpl implements TestService {

    @Resource
    TestMapper testMapper;

    @Override
    public List<Student> getStudent() {
        return testMapper.getStudent();
    }
}
