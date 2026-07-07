package com.boot.example.mapper;

import com.boot.example.domain.StudentDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    List<StudentDTO> studentList();
}
