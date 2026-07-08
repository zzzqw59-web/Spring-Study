package com.boot.example.mapper;

import com.boot.example.domain.EmployeesDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeesMapper {
    List<EmployeesDTO> employeesList();

    int employeesInsert(EmployeesDTO employeesDTO);
}
