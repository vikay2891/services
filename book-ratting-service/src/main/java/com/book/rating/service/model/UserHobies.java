package com.book.rating.service.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author vikas.bhardwaj3
 * This entity hold the data for userHobies
 * 2/7/20208:44 PM2020
 */
@Getter
@Setter
@Embeddable
public class UserHobies {

  /*  @Id
    @GeneratedValue
    private int hobiesId;*/

    private String indoorHobeis;

    private String outdoorHobeis;

}
