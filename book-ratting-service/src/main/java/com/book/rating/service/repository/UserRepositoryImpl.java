package com.book.rating.service.repository;

import com.book.rating.service.model.User;
import com.book.rating.service.repository.jpa.UserJpa;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

/**
 * @author vikas.bhardwaj3
 * 2/12/20208:58 PM2020
 */
public class UserRepositoryImpl  implements UserRepository{

    @Autowired
    UserJpa userJpa;
    @Override
    public Optional<User> findById(String userName) {
        return userJpa.findById(1212);
    }
}
