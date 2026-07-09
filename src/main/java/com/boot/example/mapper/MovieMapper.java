package com.boot.example.mapper;

import com.boot.example.domain.MovieDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MovieMapper {
    List<MovieDTO> movieList();

    int movieInsert(MovieDTO movieDTO);
}
