package com.example.service.login;

import com.example.Dto.LoginRequest;
import com.example.service.login.impl.LoginServceimpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LoginServiceTest {

    @Autowired
    LoginService loginService;

    @Test
    void login() {
        LoginRequest login = loginService.login("1", "111");
        System.out.println(login);
    }
}
