package com.book.info.service.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author vikas.bhardwaj3
 * 2/2/202011:20 PM2020
 */
@Entity
@NoArgsConstructor
@Getter
@Setter
public class BookInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookId;

    private String bookName;

    private String bookDesc;

}
