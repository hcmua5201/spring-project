package com.example.service.my;

import com.example.Dto.MyRequest;

public interface MyService {

    MyRequest selectById(Integer id);

    int update(MyRequest myRequest);
}
