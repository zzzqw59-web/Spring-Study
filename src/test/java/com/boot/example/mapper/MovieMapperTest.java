package com.boot.example.mapper;

import com.boot.example.domain.MovieDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.test.autoconfigure.AutoConfigureTestDatabase;

@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Slf4j
public class MovieMapperTest {
    @Autowired
    private MovieMapper movieMapper;

    @Test
    public void movieListTest() {
        movieMapper.movieList().forEach(movie -> {
            log.info(movie.toString());
        });
    }

    @Test
    public void movieInsertTest() {
        MovieDTO movie = new MovieDTO();
        movie.setTitle("그루민");
        movie.setDirector("톨킨");
        movie.setGallery(300);
        movie.setGenre("판타지");

        int result = movieMapper.movieInsert(movie);

        log.info("추가된 행의 수: {}", result);
    }
}
