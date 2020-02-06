package com.book.rating.service.manager;

import com.book.rating.service.model.Rating;
import com.book.rating.service.model.UserRating;

import java.util.List;
import java.util.Optional;

/**
 * @author vikas.bhardwaj3
 * 2/3/202010:13 AM2020
 */
public interface RatingManager {


    /**
     * This method is used to save user-rating data
     * @return
     */
    UserRating createRating(UserRating userRating);

    /**
     * This method is used to get rating
     * @param ratingid
     * @return
     */

    Optional<Rating> getRatingByid(Long ratingid);

    /**
     * This methos is used to get ratingList
     * @return
     */
    Iterable<Rating> getratingList();
}
