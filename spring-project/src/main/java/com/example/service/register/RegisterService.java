package com.example.service.register;

import com.example.domain.Student;

public interface RegisterService {

    Student selectByName(String name);

    int insert(Student student);
}
