package com.example.service.login;

import com.example.Dto.LoginRequest;

public interface LoginService {

    LoginRequest login(String username,String password);
}
