package com.example.controller;

import com.example.Dto.MyRequest;
import com.example.service.my.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/my")
public class MyController {

    @Autowired
    MyService myService;

    @GetMapping("/{id}")
    public Result selectById(@PathVariable Integer id){
        System.out.println(id);
        MyRequest myRequest = myService.selectById(id);
        if (myRequest!=null){
            return new Result(Code.select_ok,"查询成功",myRequest);
        }
        return new Result(Code.select_err,"查询失败",null);
    }

    @PutMapping
    public Result update(@RequestBody MyRequest myRequest){
        System.out.println(myRequest);
        int update = myService.update(myRequest);
        if (update==1){
            return new Result(Code.update_ok,"修改成功",update);
        }
        return new Result(Code.update_err,"修改失败",null);
    }
}
