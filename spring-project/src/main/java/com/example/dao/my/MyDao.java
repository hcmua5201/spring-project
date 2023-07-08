package com.example.dao.my;

import com.example.Dto.MyRequest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface MyDao {

    @Select("select id,username,name,password from student where id=#{id}")
    MyRequest selectById(Integer id);

    @Update("UPDATE student set username = #{username},name = #{name},password = #{password} where id=#{id}")
    int update(MyRequest myRequest);
}
