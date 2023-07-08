package com.example.controller;

import com.example.Dto.AllRequest;
import com.example.Dto.ClassRequest;
import com.example.service.allStudent.AllService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/all")
public class AllController {

    @Autowired
    AllService allService;

    @GetMapping
    public Result selectAll(){
        List<AllRequest> allRequests = allService.selectAll();
        System.out.println(allRequests);
        return new Result(Code.select_ok,"查询成功",allRequests);
    }

    @GetMapping("/selectById/{id}")
    public Result selectById(@PathVariable Integer id){
        System.out.println(id);
        AllRequest allRequest = allService.selectById(id);
        return new Result(Code.select_ok,"查询成功",allRequest);
    }

    @PutMapping
    public Result update(@RequestBody AllRequest allRequest){
        System.out.println(allRequest);
        int update = allService.update(allRequest);
        if (update==1){
            return new Result(Code.update_ok,"修改成功",update);
        }
        return new Result(Code.update_err,"修改失败",null);
    }

    @DeleteMapping
    public Result deleteById(@RequestParam Integer id){
        int i = allService.deleteById(id);
        if (i==1){
            return new Result(Code.delete_ok,"删除成功",i);
        }
        return new Result(Code.delete_err,"删除失败",null);
    }
}
