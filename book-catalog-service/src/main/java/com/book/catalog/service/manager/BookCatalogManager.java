package com.book.catalog.service.manager;

import com.book.catalog.service.model.BookCatalogItem;
import com.book.catalog.service.model.BookInfo;
import com.book.catalog.service.model.Rating;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author vikas.bhardwaj3
 * 2/1/20209:58 PM2020
 */
@Service
public interface BookCatalogManager {

    /**
     * This method is used to create book catalog
     * @param bookCatalogItemList
     * @return
     */
    Iterable<BookCatalogItem> createBookCatalogList(List<BookCatalogItem> bookCatalogItemList);

    /**
     * This method is used to get book from another service
     * @param bookId
     * @return
     */
    BookInfo getBook(Long bookId);

    /**
     * This methos is used to get rating list
     * @return
     */
    List<Rating> getRattingList();
}
