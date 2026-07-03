package com.boot.example.controller;

import com.boot.example.domain.SampleDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/exam05")
    public String exam05(@ModelAttribute SampleDTO dto, Model model) {
        model.addAttribute("dto", dto);
        return "example/exam03";
    }

    @PostMapping("/exam04Array")
    public String exam04Array(@RequestParam("hobby") String[] hobbyList, Model model) {
        model.addAttribute("hobbyList", hobbyList);
        return "example/exam04Array";
    }
}
