package com.boot.example.mapper;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.test.autoconfigure.AutoConfigureTestDatabase;

@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Slf4j
public class SubjectMapperTest {
    @Autowired
    private SubjectMapper subjectMapper;

    @Test
    public void subjectListTest() {
        subjectMapper.subjectList().forEach(subject -> {
            log.info(subject.toString());
        });
    }
}
