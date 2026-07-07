package com.boot.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ExampleMapper {
    String getDate();

    @Select("SELECT COUNT(*) FROM student")
    public int getStudentCount();
}
