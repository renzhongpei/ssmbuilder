package com.rzp.service;

import com.rzp.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {

    void addBook(Books book);
    void deleteBookById(int id);
    void updateBook(Books book);
    Books queryBookById(int id);
    List<Books> queryAllBook();
    List<Books> searchBook(@Param("bookName") String bookName);

}
