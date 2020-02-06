package com.book.rating.service.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * @author vikas.bhardwaj3
 * 2/6/20208:27 PM2020
 */
@NoArgsConstructor
@Setter
@Getter
@Entity
public class UserRating {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userRatingId;

    private String userId;

    @OneToMany(targetEntity = Rating.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "cp_fk", referencedColumnName = "userRatingId")
    private List<Rating> userRating;
}
