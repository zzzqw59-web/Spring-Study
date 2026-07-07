package com.boot.example.mapper;

import com.boot.example.domain.Book;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.test.autoconfigure.AutoConfigureTestDatabase;

@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Slf4j
public class BookMapperTests {
    @Autowired
    private BookMapper bookMapper;

    @Test
    public void bookListTest() {
        bookMapper.bookList().forEach(book -> log.info(book.toString()));
    }

    @Test
    public void bookTestInsert() {
        Book book = new Book();
        book.setTitle("너를 아끼며 살아라");
        book.setAuthor("나태주");
        book.setPublisher("더블북");
        book.setPublishDate("2025-06-12");
        book.setPrice(18500);

        int result = bookMapper.bookInsert(book);

        log.info("적용된 행 갯수: {}", result);
        log.info("등록된 책 정보: {}", book);
        log.info("자동 생성된 도서 번호: {}", book.getBookId());
    }
}
