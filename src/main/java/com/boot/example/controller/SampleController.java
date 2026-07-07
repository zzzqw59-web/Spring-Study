package com.boot.example.controller;

import com.boot.example.domain.MemberDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/sample")
public class SampleController {
    @GetMapping(value = "/message", produces = MediaType.TEXT_PLAIN_VALUE)
    public String message() {
        return "절망감을 느끼지 않는 가장 좋은 방법은 일어나서 무언가를 하는 것이다.";
    }

    @GetMapping("/member")
    public MemberDTO member() {
        return new MemberDTO(1L, "홍길동", "javauser@naver.com", "010-7690-1235");
    }

    @GetMapping("/member-list")
    public List<MemberDTO> getList() {
        List<MemberDTO> list = new ArrayList<>();
        list.add(new MemberDTO(2L, "김철수", "spring@naver.com", "010-2376-9012"));
        list.add(new MemberDTO(3L, "이도진", "boot@naver.com", "010-7820-5379"));
        list.add(new MemberDTO(4L, "강진석", "java@naver.com", "010-3120-8934"));

        return list;
    }

    @GetMapping(value = "/member-map")
    public Map<String, MemberDTO> getMap() {
        Map<String, MemberDTO> map = new HashMap<>();
        map.put("first", new MemberDTO(5L, "최진희", "spring123@naver.com", "010-2356-3390"));

        return map;
    }
}
