package com.example.dao.Class;

import com.example.Dto.ClassRequest;
import com.example.domain.Class;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;


@Mapper
public interface ClassDao {

    @Select("select * from class")
    List<ClassRequest> selectAll();

    @Select("select * from class where id=#{id}")
    ClassRequest selectById(Integer id);


    @Update("UPDATE class set className = #{className},studentCount = #{studentCount} where id=#{id}")
    int update(ClassRequest classRequest);

    @Delete("delete  from class where id=#{id}")
    int deleteById(Integer id);
}
