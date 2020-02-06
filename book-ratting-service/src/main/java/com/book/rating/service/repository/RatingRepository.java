package com.book.rating.service.repository;

import com.book.rating.service.model.Rating;
import com.book.rating.service.model.UserRating;

import java.util.List;
import java.util.Optional;

/**
 * @author vikas.bhardwaj3
 * 2/3/202010:19 AM2020
 */
public interface RatingRepository {

    /**
     * This method is used to save rating in database
     *
     * @param userRating
     * @return
     */
    UserRating saveRating(UserRating userRating);

    /**
     * This method is used to get rating data from database
     *
     * @param ratingId
     * @return
     */

    Optional<Rating> getRating(Long ratingId);

    /**
     * This method is used to ger rating list from database
     *
     * @return
     */
    Iterable<Rating> getRatingList();
}
