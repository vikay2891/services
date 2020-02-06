package com.book.catalog.service.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @author vikas.bhardwaj3
 * 2/6/20208:16 PM2020
 */
@NoArgsConstructor
@Getter
@Setter
public class UserRating {

    private String useId;
    private List<Rating> ratings;
}
