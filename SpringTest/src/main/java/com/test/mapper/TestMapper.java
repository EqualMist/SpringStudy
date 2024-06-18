package com.test.mapper;

import com.test.bean.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TestMapper {

    @Select("SELECT * FROM student where sid = 1")
    public List<Student> getStudent();

    @Insert("INSERT INTO student(name, sex, grade) VALUES(#{name}, #{sex}, #{grade})")
    public void insertStudent(Student student);
}
