package com.example.service.register.impl;

import com.example.dao.register.RegisterDao;
import com.example.domain.Student;
import com.example.service.register.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceimpl implements RegisterService {

    @Autowired
    RegisterDao registerDao;
    @Override
    public Student selectByName(String name) {
        return registerDao.selectByName(name);
    }

    @Override
    public int insert(Student student) {
        return registerDao.insert(student);
    }
}
