package com.boot.example.mapper;

import com.boot.example.domain.StudentDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StudentMapper {
    List<StudentDTO> studentList();

    String studentAutoNumber(@Param("subjectNumber") String subjectNumber);

    int studentIdCheck(@Param("studentId") String studentId);
}
