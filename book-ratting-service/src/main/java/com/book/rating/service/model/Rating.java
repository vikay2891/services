package com.book.rating.service.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author vikas.bhardwaj3
 * 2/3/202010:08 AM2020
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ratingId;

    private String bookName;

    private int rating;



}
