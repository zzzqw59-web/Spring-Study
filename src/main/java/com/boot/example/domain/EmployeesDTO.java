package com.boot.example.domain;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmployeesDTO {
    private int employeeID;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private int salary;
}
