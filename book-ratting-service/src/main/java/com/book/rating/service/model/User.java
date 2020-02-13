package com.book.rating.service.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author vikas.bhardwaj3
 * 2/12/20203:17 PM2020
 */
@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;
    private String userName;
    private String password;
  //  private boolean active;
    private String roles;
}
