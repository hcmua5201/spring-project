package com.example.service.Class.impl;

import com.example.Dto.ClassRequest;
import com.example.dao.Class.ClassDao;
import com.example.domain.Class;
import com.example.service.Class.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceimpl implements ClassService {

    @Autowired
    ClassDao classDao;

    @Override
    public List<ClassRequest> selectAll() {
        return classDao.selectAll();
    }

    @Override
    public ClassRequest selectById(Integer id) {
        return classDao.selectById(id);
    }

    @Override
    public int update(ClassRequest classRequest) {
        return classDao.update(classRequest);
    }

    @Override
    public int deleteById(Integer id) {
        return classDao.deleteById(id);
    }
}
