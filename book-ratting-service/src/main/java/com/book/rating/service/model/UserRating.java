package com.book.rating.service.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.*;

/**
 * @author vikas.bhardwaj3
 * 2/6/20208:27 PM2020
 * This entity jold the details of Userratings
 */
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "USER_RATING")
public class UserRating {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USER_RATING_ID")
    private int userRatingId;

    @Column(name = "USER_ID")
    private String userId;

    /*   @OneToMany(targetEntity = Rating.class, cascade = CascadeType.ALL)
       @JoinColumn(name = "cp_fk", referencedColumnName = "userRatingId")
       private List<Rating> userRating;
   */
    @Embedded
    private UserAddress userAddress;

 /*   @ElementCollection
    @JoinTable(name = "USER_ADDRESS",
            joinColumns = @JoinColumn(name = "userId")
    )
    private Set<UserHobies> listofUserHobies = new HashSet<>();*/

   /* @ElementCollection
    @JoinTable(name = "USER_ADDRESS",
            joinColumns = @JoinColumn(name = "userId")
    )
    @GenericGenerator(name = "increment-gen", strategy = "increment")
    @CollectionId(columns = {@Column(name = "ADDRESS_ID")}, type = @Type(type = "long"), generator = "increment-gen")
    private Collection<UserAddress> listOfAddress = new ArrayList<>();*/

    @OneToMany(targetEntity = Rating.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "USER_RATING_ID", referencedColumnName = "USER_RATING_ID")
    private List<Rating> rating;

}
