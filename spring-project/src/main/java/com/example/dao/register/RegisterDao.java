package com.example.dao.register;

import com.example.domain.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface RegisterDao {

    @Select("select * from student where name=#{name}")
    Student selectByName(String name);

    @Insert("insert into student(username, password, name) VALUES (#{username},#{password},#{name})")
    int insert(Student student);
}
