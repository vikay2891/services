package com.book.catalog.service.repository.impl;

import com.book.catalog.service.model.BookCatalogItem;
import com.book.catalog.service.repository.BookCatalogRepository;
import com.book.catalog.service.repository.jpa.BookCatalogJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author vikas.bhardwaj3
 * 2/1/20209:39 PM2020
 */

@Repository
public class BookCatalogRepositoryImpl implements  BookCatalogRepository {

    @Autowired
    private BookCatalogJpa bookCatalogJpa;
    @Override
    public Iterable<BookCatalogItem> createBookCatalog(List<BookCatalogItem> bookCatalogItemList) {

        return  bookCatalogJpa.saveAll(bookCatalogItemList);

    }
}
