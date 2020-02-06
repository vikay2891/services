package com.book.catalog.service.repository.jpa;

import com.book.catalog.service.model.BookCatalogItem;
import org.springframework.data.repository.CrudRepository;

/**
 * @author vikas.bhardwaj3
 * 2/2/20204:48 PM2020
 */
public interface BookCatalogJpa  extends CrudRepository<BookCatalogItem ,Long> {
}
