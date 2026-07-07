package com.boot.example.mapper;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.test.autoconfigure.AutoConfigureTestDatabase;

@MybatisTest // Mybatis Mapper 테스트
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
// 테스트할 때 H2 같은 내장 DB로 바꾸지 않고, application.properties에 설정한 실제 DB를 사용하겠다는 의미
@Slf4j
public class ExampleMapperTests {
    @Autowired
    private ExampleMapper exampleMapper;

    @Test
    public void testGetDate() {
        log.info("getDate() 메서드 실행");
        log.info("현재 날짜와 시간 출력: {}", exampleMapper.getDate());
    }

    @Test
    public void testGetStudentCount() {
        log.info("getStudentCount() 메서드 실행");
        log.info("총 학생: {}", exampleMapper.getStudentCount());
    }
}
