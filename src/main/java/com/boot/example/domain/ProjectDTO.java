package com.boot.example.domain;

import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProjectDTO {
    private String projectName;
    private List<String> features;
}
