package com.boot.example.domain;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentDTO {
    private int no;
    private String name;
    private String birth;
    private String phone;
    private String address;
    private String email;
}
