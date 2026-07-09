package com.boot.example.controller;

import com.boot.example.domain.StudentDTO;
import com.boot.example.domain.SubjectDTO;
import com.boot.example.service.StudentService;
import com.boot.example.service.SubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;
    private final SubjectService subjectService;

    @GetMapping("/studentList")
    public void studentList(Model model, StudentDTO student) {
        List<StudentDTO> studentList = studentService.studentList();
        model.addAttribute("studentList", studentList);
        model.addAttribute("student", student);

        List<SubjectDTO> subjectList = subjectService.subjectList();
        model.addAttribute("subjectList", subjectList);
    }

    @GetMapping("/studentAutoNumber")
    @ResponseBody
    public String studentAutoNumber(String subjectNumber) {
        String studentNumber = studentService.studentAutoNumber(subjectNumber);
        return studentNumber;
    }

    @PostMapping("/studentIdCheck")
    @ResponseBody
    public String studentIdCheck(String studentId) {
        String result = studentService.studentIdCheck(studentId);
        return result;
    }
}
