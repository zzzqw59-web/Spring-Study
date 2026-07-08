package com.boot.example.mapper;

import com.boot.example.domain.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {
    List<Book> bookList();

    int bookInsert(Book book);

    int bookDelete(int bookId);

    int bookUpdate(Book book);
}
