package com.book.info.service.manager;

import com.book.info.service.model.BookInfo;

import java.util.List;
import java.util.Optional;

/**
 * @author vikas.bhardwaj3
 * 2/2/202011:19 PM2020
 */
public interface BookInfoManager {

    /**
     * This methos is used to create the books
     * @param bookInfosList
     * @return
     */
    Iterable<BookInfo> createBooks(List<BookInfo> bookInfosList);

    /**
     * This method is used to get book based on bookid
     * @param bookId
     * @return
     */
    Optional<BookInfo> getBook(Long bookId);



}
