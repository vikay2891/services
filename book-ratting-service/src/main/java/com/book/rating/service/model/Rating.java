package com.book.rating.service.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author vikas.bhardwaj3
 * This entity hold the details of user rating
 * 2/3/202010:08 AM2020
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "RATING")
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RATING_ID")
    private int ratingId;

    @Column(name = "BOOK_NAME")
    private String bookName;

    @Column(name = "RATINGS")
    private float ratings;
/*    @Column(name = "USER_RATING_ID")
    private int userRatingId;*/


}
