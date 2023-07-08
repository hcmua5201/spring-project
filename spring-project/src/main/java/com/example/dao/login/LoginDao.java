package com.example.dao.login;

import com.example.Dto.LoginRequest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LoginDao {

    @Select("select id,username,password from student where username=#{username} and password=#{password}")
    LoginRequest login(String username,String password);

}
