package com.example.controller;


import com.example.Dto.ClassRequest;
import com.example.domain.Class;
import com.example.service.Class.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/class")
public class ClassController {

    @Autowired
    ClassService classService;

    @GetMapping
    public Result selectAll(){
        List<ClassRequest> classRequests = classService.selectAll();
        System.out.println(classRequests);
        return new Result(Code.select_ok,"查询成功",classRequests);
    }

    @GetMapping("/selectById/{id}")
    public Result selectById(@PathVariable Integer id){
        System.out.println(id);
        ClassRequest classRequest = classService.selectById(id);
        return new Result(Code.select_ok,"查询成功",classRequest);
    }

    @PutMapping
    public Result update(@RequestBody ClassRequest classRequest){
        System.out.println(classRequest);
        int update = classService.update(classRequest);
        if (update==1){
            return new Result(Code.update_ok,"修改成功",update);
        }
        return new Result(Code.update_err,"修改失败",null);
    }

    @DeleteMapping
    public Result deleteById(@RequestParam Integer id){
        int i = classService.deleteById(id);
        if (i==1){
            return new Result(Code.delete_ok,"删除成功",i);
        }
        return new Result(Code.delete_err,"删除失败",null);
    }
}
