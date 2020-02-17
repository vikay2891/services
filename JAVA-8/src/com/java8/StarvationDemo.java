package com.java8;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author vikas.bhardwaj3
 * 2/14/202011:27 AM2020
 */
public class StarvationDemo {



    public static void main(String[] args) {
        AtomicInteger x= new AtomicInteger();

        Runnable task1 = () -> {
        x.set(3);

        };
    }

}
