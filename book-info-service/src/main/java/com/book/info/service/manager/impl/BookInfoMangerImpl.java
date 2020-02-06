package com.book.info.service.manager.impl;

import com.book.info.service.manager.BookInfoManager;
import com.book.info.service.model.BookInfo;
import com.book.info.service.repository.impl.BookInfoRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 * @author vikas.bhardwaj3
 * 2/2/202011:19 PM2020
 */
@Component
public class BookInfoMangerImpl implements BookInfoManager {
    @Autowired
    private BookInfoRepositoryImpl bookRepository;

    @Override
    public Iterable<BookInfo> createBooks(List<BookInfo> bookInfosList) {

        return bookRepository.saveBooks(bookInfosList);
    }

    @Override
    public Optional<BookInfo> getBook(Long bookId) {
        return bookRepository.getBookById(bookId);
    }
}
