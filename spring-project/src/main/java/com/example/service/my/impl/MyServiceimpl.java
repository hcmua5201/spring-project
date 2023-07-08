package com.example.service.my.impl;

import com.example.Dto.MyRequest;
import com.example.dao.my.MyDao;
import com.example.service.my.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyServiceimpl implements MyService {

    @Autowired
    MyDao myDao;
    @Override
    public MyRequest selectById(Integer id) {
        return myDao.selectById(id);
    }

    @Override
    public int update(MyRequest myRequest) {
        return myDao.update(myRequest);
    }
}
