package com.book.rating.service.repository.jpa;

import com.book.rating.service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author vikas.bhardwaj3
 * 2/12/20203:23 PM2020
 */
public interface UserJpa extends JpaRepository<User ,Integer> {

    Optional<User> findByUserName(String  userName);



}
