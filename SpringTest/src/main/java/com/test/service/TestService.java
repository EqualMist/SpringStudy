package com.test.service;

import com.test.bean.Student;

import java.util.List;

public interface TestService {

    List<Student>getStudent();

    void insertStudent(Student student);
}
