package com.book.rating.service;

import com.book.rating.service.model.User;
import com.book.rating.service.repository.jpa.UserJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author vikas.bhardwaj3
 * 2/12/20203:16 PM2020
 */
@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserJpa userJpa;


    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {


        Optional<User> user = userJpa.findByUserName(userName);
        user.orElseThrow(()->new UsernameNotFoundException(userName+" Not Found"));
       return  user.map(MyUserDetails::new).get();

    }
}
