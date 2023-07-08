package com.example.controller;

import com.example.domain.Student;
import com.example.service.register.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/register")
public class RegisterController {
    @Autowired
    RegisterService registerService;

    @GetMapping("/{name}")
    public Result selectByName(@PathVariable String name){
        System.out.println(name);
        Student student = registerService.selectByName(name);
        if (student!=null){
            return new Result(Code.select_err,"该姓名被注册",null);
        }
        return new Result(Code.select_ok,"姓名可以注册",null);
    }


    @PutMapping
    public Result insert(@RequestBody Student student){
        System.out.println(student);
        int insert = registerService.insert(student);
        if (insert==1){
            return new Result(Code.insert_ok,"注册成功",insert);
        }
        return new Result(Code.insert_err,"注册失败",insert);
    }
}
