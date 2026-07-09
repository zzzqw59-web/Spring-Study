package com.boot.example.service;

import com.boot.example.domain.StudentDTO;
import com.boot.example.mapper.StudentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentMapper studentMapper;

    @Override
    public List<StudentDTO> studentList() {
        List<StudentDTO> studentList = studentMapper.studentList();
        return studentList;
    }

    @Override
    public String studentAutoNumber(String subjectNumber) {
        String studentNumber = studentMapper.studentAutoNumber(subjectNumber);
        return studentNumber;
    }

    @Override
    public String studentIdCheck(String studentId) {
        int result = studentMapper.studentIdCheck(studentId);
        return (result == 1) ? "사용할 수 없는 아이디입니다." : "사용할 수 있는 아이디입니다.";
    }
}
