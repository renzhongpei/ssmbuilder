package com.rzp.service;

import com.rzp.dao.BookMapper;
import com.rzp.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{
    //Service调用dao层，因此要组合Dao
    @Autowired
    private BookMapper bookMapper;

    public BookMapper getBookMapper() {
        return bookMapper;
    }

    public void setBookMapper(BookMapper bookMapper) {
        bookMapper = bookMapper;
    }

    @Override
    public void addBook(Books book) {
        bookMapper.addBook(book);
    }

    @Override
    public void deleteBookById(int id) {
        bookMapper.deleteBookById(id);
    }

    @Override
    public void updateBook(Books book) {
        bookMapper.updateBook(book);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }

    @Override
    public List<Books> searchBook(String bookName) {
        return bookMapper.searchBook(bookName);
    }
}
