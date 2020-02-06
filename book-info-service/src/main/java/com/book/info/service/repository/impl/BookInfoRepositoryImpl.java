package com.book.info.service.repository.impl;

import com.book.info.service.model.BookInfo;
import com.book.info.service.repository.BookRepository;
import com.book.info.service.repository.jpa.BookInfoJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author vikas.bhardwaj3
 * 2/2/202011:25 PM2020
 */
@Repository
public class BookInfoRepositoryImpl implements BookRepository {

    @Autowired
    private BookInfoJpa bookInfoJpa;
    /**
     *This method  is used to save the list of books in database
     * @param bookInfoList
     * @return
     */
    @Override
    public Iterable<BookInfo> saveBooks(List<BookInfo> bookInfoList) {
        return bookInfoJpa.saveAll(bookInfoList);
    }

    @Override
    public Optional<BookInfo> getBookById(Long bookId) {
        return bookInfoJpa.findById( bookId);
    }
}
