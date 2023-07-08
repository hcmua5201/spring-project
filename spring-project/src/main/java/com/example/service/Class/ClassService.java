package com.example.service.Class;


import com.example.Dto.ClassRequest;
import com.example.domain.Class;

import java.util.List;

public interface ClassService {


    List<ClassRequest> selectAll();

    ClassRequest selectById(Integer id);

    int update(ClassRequest classRequest);

    int deleteById(Integer id);
}
