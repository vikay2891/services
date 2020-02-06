package com.book.catalog.service.repository;

import com.book.catalog.service.model.BookCatalogItem;

import java.util.List;

/**
 * @author vikas.bhardwaj3
 * 2/1/20209:26 PM2020
 */

public interface BookCatalogRepository{

    Iterable<BookCatalogItem> createBookCatalog(List<BookCatalogItem> bookCatalogItem);
}
