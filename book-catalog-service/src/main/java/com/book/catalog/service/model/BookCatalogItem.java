package com.book.catalog.service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * @author vikas.bhardwaj3
 * 2/1/20209:16 PM2020
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class BookCatalogItem {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int  bookCatalogItemId;
    @NotNull
    private String bookName;
    @NotNull
    private String desc;
    @NotNull
    private int ratting;
}
