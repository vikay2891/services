package com.book.rating.service.repository;

import com.book.rating.service.model.Rating;
import com.book.rating.service.model.UserRating;
import com.book.rating.service.repository.jpa.RatingJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author vikas.bhardwaj3
 * 2/3/202010:22 AM2020
 */
@Repository
public class RatingRepositoryImpl implements RatingRepository {

    @Autowired
    private RatingJpa ratingJpa;
    @Override
    public UserRating saveRating(UserRating userRating) {
        return ratingJpa.save(userRating);
    }

    @Override
    public Optional<Rating> getRating(Long ratingId) {
        return Optional.empty();
    }

    @Override
    public Iterable<Rating> getRatingList() {
        return null;
    }

   /* @Override
    public Optional<Rating> getRating(Long ratingId) {

        return ratingJpa.findById(ratingId);
    }

    @Override
    public Iterable<Rating> getRatingList() {
        return ratingJpa.findAll();
    }*/
}
