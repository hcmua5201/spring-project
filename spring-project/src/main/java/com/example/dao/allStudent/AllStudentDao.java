package com.example.dao.allStudent;


import com.example.Dto.AllRequest;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface AllStudentDao {

    @Select("select id,  classname, studentnumber,name from student")
    List<AllRequest> selectAll();

    @Select("select * from student where id=#{id}")
    AllRequest selectById(Integer id);

    @Update("UPDATE student set className = #{className},studentNumber = #{studentNumber},name = #{name} where id=#{id}")
    int update(AllRequest allRequest);

    @Delete("delete from student where id=#{id}")
    int deleteById(Integer id);
}
