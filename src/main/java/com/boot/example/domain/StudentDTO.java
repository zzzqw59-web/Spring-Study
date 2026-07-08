package com.boot.example.domain;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.security.auth.Subject;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentDTO {
    private int no;
    private String studentNumber;
    private String studentName;
    private String studentId;
    private String studentPassword;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate studentBirth;
    private String studentPhone;
    private String studentAddress;
    private String studentEmail;
    private LocalDateTime regDate;

    private SubjectDTO subjectDTO;
}
