package com.example.service.allStudent.impl;

import com.example.Dto.AllRequest;
import com.example.dao.allStudent.AllStudentDao;
import com.example.service.allStudent.AllService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllServiceimpl implements AllService {

    @Autowired
    AllStudentDao allStudentDao;
    @Override
    public List<AllRequest> selectAll() {
        return allStudentDao.selectAll();
    }

    @Override
    public AllRequest selectById(Integer id) {
        return allStudentDao.selectById(id);
    }

    @Override
    public int update(AllRequest allRequest) {
        return allStudentDao.update(allRequest);
    }

    @Override
    public int deleteById(Integer id) {
        return allStudentDao.deleteById(id);
    }
}
