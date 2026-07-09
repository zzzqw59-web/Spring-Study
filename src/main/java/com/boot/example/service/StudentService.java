package com.boot.example.service;

import com.boot.example.domain.StudentDTO;

import java.util.List;

public interface StudentService {
    List<StudentDTO> studentList();

    String studentAutoNumber(String subjectNumber);

    String studentIdCheck(String studentId);
}
