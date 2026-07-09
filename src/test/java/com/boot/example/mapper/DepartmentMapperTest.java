package com.boot.example.mapper;

import com.boot.example.domain.DepartmentDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.test.autoconfigure.AutoConfigureTestDatabase;

@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Slf4j
public class DepartmentMapperTest {
    @Autowired
    private DepartmentMapper departmentMapper;

    @Test
    public void departmentListTest() {
        departmentMapper.departmentList().forEach(department -> {
            log.info(department.toString());
        });
    }

    @Test
    public void departmentInsertTest() {
        DepartmentDTO department = new DepartmentDTO();
        department.setDepartmentId(999);
        department.setDepartmentName("james");
        department.setManagerId(998);
        department.setLocationId(997);

        int result = departmentMapper.departmentInsert(department);

        log.info("측정된 수량: {}", result);
    }
}
