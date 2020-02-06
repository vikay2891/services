package com.book.catalog.service.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author vikas.bhardwaj3
 * 2/3/202010:08 AM2020
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Rating implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ratingId;
    private String bookName;
    private int rating;
}
