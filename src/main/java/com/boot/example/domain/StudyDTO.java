package com.boot.example.domain;

import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudyDTO {
    private String title;
    private List<String> courses;
}
