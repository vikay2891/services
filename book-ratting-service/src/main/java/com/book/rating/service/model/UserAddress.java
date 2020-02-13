package com.book.rating.service.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author vikas.bhardwaj3
 * 2/7/20208:02 PM2020
 * This entity hold the detals of UserAdderess
 */
@NoArgsConstructor
@Getter
@Setter
@Embeddable
public class UserAddress {

    /*@Id
    @GeneratedValue
    private int addressId;*/
    private String city;
    private String state;
    private int pinCode;


}
