package com.DI;

import org.springframework.stereotype.Component;
import sun.misc.Contended;

/**
 * @author vikas.bhardwaj3
 * 3/5/20205:26 PM2020
 */
@Component
public class Rectangle implements Drawing {
    @Override
    public void shape() {
        System.out.println("rectangle shape");
    }
}
