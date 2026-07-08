package com.boot.example.mapper;

import com.boot.example.domain.EmployeesDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.test.autoconfigure.AutoConfigureTestDatabase;

@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Slf4j
public class EmployeesMapperTest {
    @Autowired
    private EmployeesMapper employeesMapper;

    @Test
    public void employeesListTest() {
        employeesMapper.employeesList().forEach(employee -> {
            log.info(employee.toString());
        });
    }

    @Test
    public void employeesInsertTest() {
        EmployeesDTO employees = new EmployeesDTO();
        employees.setEmployeeID(300);
        employees.setFirstName("jame");
        employees.setLastName("sujin");
        employees.setEmail("zzzqw11@naver.com");
        employees.setPhoneNumber("513.462.4866");
        employees.setSalary(36000);

        int result = employeesMapper.employeesInsert(employees);

        log.info("적용된 행의 수: {}", result);
    }
}
