package com.book.rating.service.manager.impl;

import com.book.rating.service.manager.RatingManager;
import com.book.rating.service.model.Rating;
import com.book.rating.service.model.UserRating;
import com.book.rating.service.repository.RatingRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author vikas.bhardwaj3
 * 2/3/202010:15 AM2020
 */

@Service
public class RatingManagerImpl implements RatingManager {


    @Autowired
    private RatingRepositoryImpl ratingRepositoryImpl;
    @Override
    public UserRating createRating(UserRating userRating) {
        return ratingRepositoryImpl.saveRating(userRating);
    }

    @Override
    public Optional<Rating> getRatingByid(Long ratingid) {
        return ratingRepositoryImpl.getRating(ratingid);
    }

    @Override
    public Iterable<Rating> getratingList() {
        return ratingRepositoryImpl.getRatingList();
    }
}
