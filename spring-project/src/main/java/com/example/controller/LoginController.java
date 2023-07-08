package com.example.controller;

import com.example.Dto.LoginRequest;
import com.example.service.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/login")
public class LoginController {

    @Autowired
    LoginService loginService;

    @PostMapping
    public Result login(@RequestBody LoginRequest loginRequest){
        System.out.println(loginRequest);
        LoginRequest login = loginService.login(loginRequest.getUsername(), loginRequest.getPassword());
        if (login!=null){
            return new Result(Code.select_ok,"登录成功",login);
        }
        return new Result(Code.select_err,"登录失败",null);
    }

}
