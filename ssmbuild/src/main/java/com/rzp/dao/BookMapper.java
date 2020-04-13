package com.rzp.dao;

import com.rzp.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    void addBook(Books book);
    void deleteBookById(@Param("bookId") int id);
    void updateBook(Books book);
    Books queryBookById(@Param("bookId") int id);
    List<Books> queryAllBook();
    List<Books> searchBook(@Param("bookName") String bookName);
}
