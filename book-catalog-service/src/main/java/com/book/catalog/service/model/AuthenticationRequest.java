package com.book.catalog.service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author vikas.bhardwaj3
 * 2/13/20203:07 PM2020
 */
@Getter
@Setter
@AllArgsConstructor
public class AuthenticationRequest {

    private String userName;
    private String password;
}
