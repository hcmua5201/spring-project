package com.example.service.allStudent;

import com.example.Dto.AllRequest;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface AllService {


    List<AllRequest> selectAll();


    AllRequest selectById(Integer id);


    int update(AllRequest allRequest);


    int deleteById(Integer id);
}
