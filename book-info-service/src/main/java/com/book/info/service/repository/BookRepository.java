package com.book.info.service.repository;

import com.book.info.service.model.BookInfo;

import java.util.List;
import java.util.Optional;

/**
 * @author vikas.bhardwaj3
 * 2/2/202011:24 PM2020
 */
public interface BookRepository {


    /**
     * This method is used to save list of books im table
     * @param bookInfoList
     * @return
     */
    Iterable<BookInfo> saveBooks(List<BookInfo> bookInfoList);

    /**
     * This method is used to get book stored in table based on book id
     * @param bookId
     * @return
     */
    Optional<BookInfo> getBookById(Long bookId);


}
