package com.book.catalog.service.security;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author vikas.bhardwaj3
 * 2/13/20202:42 PM2020
 */
@Service
public class MyUserDeatilsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        return new User("vikas","vik",new ArrayList<>());
    }
}
