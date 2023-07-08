package com.example.service.login.impl;

import com.example.Dto.LoginRequest;
import com.example.dao.login.LoginDao;
import com.example.service.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServceimpl implements LoginService {

    @Autowired
    LoginDao loginDao;
    @Override
    public LoginRequest login(String username, String password) {
        return loginDao.login(username,password);
    }
}
