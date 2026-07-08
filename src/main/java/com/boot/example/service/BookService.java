package com.boot.example.service;

import com.boot.example.domain.Book;

import java.util.List;

public interface BookService {
    List<Book> bookList();

    int bookInsert(Book book);

    int bookUpdate(Book book);

    int bookDelete(int bookId);
}
