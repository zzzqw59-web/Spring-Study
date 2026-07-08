package com.boot.example.mapper;

import com.boot.example.domain.SubjectDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SubjectMapper {
    List<SubjectDTO> subjectList();
}
