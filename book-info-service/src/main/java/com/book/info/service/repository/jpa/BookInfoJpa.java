package com.book.info.service.repository.jpa;

import com.book.info.service.model.BookInfo;
import lombok.Lombok;
import org.springframework.data.repository.CrudRepository;

/**
 * @author vikas.bhardwaj3
 * 2/2/202011:27 PM2020
 */
public interface BookInfoJpa extends CrudRepository<BookInfo, Long> {
}
