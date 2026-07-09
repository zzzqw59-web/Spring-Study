package com.boot.example.mapper;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.test.autoconfigure.AutoConfigureTestDatabase;

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
    public void studentAutoNumberTest() {
        String studentNumber = studentMapper.studentAutoNumber("01");
        log.info("컴퓨터학과 선택 시 자동 생성된 학번: {}", studentNumber);
    }

    @Test
    public void studentIdCheckTest() {
        int result = studentMapper.studentIdCheck("javajsp");
        log.info("아이디 중복 검사 결과: {} (1: 중복, 0: 사용가능)", result);
    }
}
