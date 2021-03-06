package com.book.rating.service.controller;

import com.book.rating.service.manager.RatingManager;
import com.book.rating.service.model.Rating;
import com.book.rating.service.model.User;
import com.book.rating.service.model.UserRating;
import com.book.rating.service.repository.jpa.UserJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;
import java.util.Optional;

/**
 * @author vikas.bhardwaj3
 * 2/3/202010:32 AM2020
 */
@RestController
@RequestMapping("/rating")
@EnableSwagger2
public class RatingController {


    @Autowired
    private RatingManager ratingManager;

    @Autowired
    UserJpa userJpa;

    @PostMapping("/createUser")
    public User createUserRating(@RequestBody User user) {
        return userJpa.save(user);

    }


    @PostMapping("/createRatings")
    public UserRating createUserRating(@RequestBody UserRating userRating) {
        return ratingManager.createRating(userRating);

    }

    @GetMapping("/{ratingId}")
    public Optional<Rating> getRating(@PathVariable Long ratingId) {

        return ratingManager.getRatingByid(ratingId);
    }
    @GetMapping("/ratingList")
     public Iterable<Rating> getRatingList(){
        return  ratingManager.getratingList();

     }
}
