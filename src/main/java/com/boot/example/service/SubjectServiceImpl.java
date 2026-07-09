package com.boot.example.service;

import com.boot.example.domain.SubjectDTO;
import com.boot.example.mapper.SubjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SubjectServiceImpl implements SubjectService {
    private final SubjectMapper subjectMapper;

    @Override
    public List<SubjectDTO> subjectList() {
        List<SubjectDTO> subjectList = subjectMapper.subjectList();
        return subjectList;
    }
}
