package com.boot.example.mapper;

import com.boot.example.domain.StudentDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.test.autoconfigure.AutoConfigureTestDatabase;

import java.time.LocalDate;
import java.time.LocalDateTime;

@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Slf4j
public class StudentMapperTest {
    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void studentListTest() {
        studentMapper.studentList().forEach(student -> {
            log.info(student.toString());
        });
    }

    @Test
    public void studentInsertTest() {
        StudentDTO student = new StudentDTO();
        student.setStudentNumber("0606");
        student.setStudentName("한익현");
        student.setStudentId("javauser");
        student.setStudentPassword("javauser123");
        student.setStudentBirth(LocalDate.parse("1997-08-29"));
        student.setStudentPhone("010-6323-4862");
        student.setStudentAddress("서울시 동작구 은평동");
        student.setStudentEmail("afaf@naver.com");
        student.setRegDate(LocalDateTime.parse("2026-06-08T10:30:00"));

        int result = studentMapper.studentInsert(student);

        log.info("적용된 행의 수: {}", result);
    }
}
