package com.book.rating.service.repository.jpa;

import com.book.rating.service.model.Rating;
import com.book.rating.service.model.UserRating;
import org.springframework.data.repository.CrudRepository;

/**
 * @author vikas.bhardwaj3
 * 2/3/202010:22 AM2020
 */
public interface RatingJpa extends CrudRepository<UserRating,Integer > {
}
