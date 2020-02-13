package com.book.rating.service.repository;

import com.book.rating.service.model.User;

import java.util.Optional;

/**
 * @author vikas.bhardwaj3
 * 2/12/20208:57 PM2020
 */
public interface UserRepository {

    Optional<User> findById(String  userName);
}
