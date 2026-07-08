package com.boot.example.domain;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SubjectDTO {
    private int no;
    private String subjectNumber;
    private String subjectName;
}
