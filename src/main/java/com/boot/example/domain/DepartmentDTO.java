package com.boot.example.domain;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DepartmentDTO {
    private int departmentId;
    private String departmentName;
    private int managerId;
    private int locationId;
}
