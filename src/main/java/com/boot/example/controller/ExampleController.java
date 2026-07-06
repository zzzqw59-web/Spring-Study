package com.boot.example.controller;

import com.boot.example.domain.ExampleDTO;
import com.boot.example.domain.ProjectDTO;
import com.boot.example.domain.SampleDTO;
import com.boot.example.domain.StudyDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/example")
public class ExampleController {
    @GetMapping("/exam01")
    public String example(Model model) {
        model.addAttribute("data", "현재 페이지에 데이터 출력");
        return "example/exam01";
    }

    @GetMapping("/form")
    public String form() {
        return "example/form";
    }

    @GetMapping("/exam03")
    public String exam03(@RequestParam String name, @RequestParam int age, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "example/exam03";
    }

    @PostMapping("/exam04")
    public String exam04(@ModelAttribute SampleDTO dto, Model model) {
        model.addAttribute("dto", dto);
        return "example/exam04";
    }

//    @GetMapping("/exam05")
//    public String exam05(@ModelAttribute SampleDTO dto, Model model) {
//        model.addAttribute("dto", dto);
//        return "example/exam03";
//    }

    @PostMapping("/exam04Array")
    public String exam04Array(@RequestParam("hobby") String[] hobbyList, Model model) {
        model.addAttribute("hobbyList", hobbyList);
        return "example/exam04Array";
    }

    @GetMapping("/exam05")
    public String exam05(Model model) {
        model.addAttribute("data1", "뷰에 출력할 데이터");
        model.addAttribute("data2", "뷰에 출력할 <strong>데이터</strong>");

        return "example/exam05";
    }

    @GetMapping("/exam06")
    public String exam06(Model model) {
        model.addAttribute("number", 3);
        model.addAttribute("data", "Spring boot");
        model.addAttribute("userRole", "admin");

        return "example/exam06";
    }

    @GetMapping("/exam07")
    public String exam07(Model model) {
        ExampleDTO exampleDTO = new ExampleDTO();
        exampleDTO.setName("홍길동");
        exampleDTO.setAge(38);
        exampleDTO.setEmail("javauser@naver.com");
        model.addAttribute("exampleDTO", exampleDTO);

        List<ExampleDTO> list = new ArrayList<>();
        list.add(new ExampleDTO("김철수", 26, "springuser@naver.com"));
        list.add(new ExampleDTO("한늘봄", 32, "jsp1234@gmail.com"));
        model.addAttribute("list", list);

        Map<Integer, ExampleDTO> map = new HashMap<>();
        map.put(1, new ExampleDTO("김미숙", 30, "javauser@naver.com"));
        map.put(2, new ExampleDTO("조한미", 23, "bootuser@naver.com"));
        model.addAttribute("map", map);

        Map<String, ExampleDTO> mapData = new HashMap<>();
        mapData.put("one", new ExampleDTO("김희수", 36, "user1234@naver.com"));
        mapData.put("two", new ExampleDTO("강진석", 29, "frontuser@naver.com"));
        model.addAttribute("mapData", mapData);
        return "example/exam07";
    }

    @GetMapping("/course")
    public String courseForm() {
        return "example/course";
    }

    @PostMapping("/course")
    public String course(@RequestParam String name, @RequestParam String course, @RequestParam String level, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("course", course);
        model.addAttribute("level", level);
        return "example/course";
    }

    @GetMapping("/exam08")
    public String exam08(Model model) {
        model.addAttribute("localDateTime", LocalDateTime.now());
        return "example/exam08";
    }

    @GetMapping("/exam02")
    public String exam02(Model model, @RequestParam(required = false, defaultValue = "java") String language, @RequestParam(required = false) String word) {
        model.addAttribute("language", language);
        model.addAttribute("word", word);

        return "example/exam02";
    }

    @GetMapping("/project")
    public String projectForm() {
        return "example/project";
    }

    @PostMapping("/project")
    public String project(ProjectDTO projectDTO, Model model) {
        model.addAttribute("projectDTO", projectDTO);

        return "example/projectResult";
    }

    @GetMapping("/study")
    public String studyGet() {
        return "example/study";
    }

    @PostMapping("/study")
    public String studyPost(@ModelAttribute StudyDTO studyDTO, Model model) {
        model.addAttribute("studyDTO", studyDTO);
        return "example/studyResult";
    }
}
