package com.java8;

import java.util.concurrent.CountDownLatch;

/**
 * @author vikas.bhardwaj3
 * 2/15/20209:08 PM2020
 */
public class DevTeam extends Thread {

    private CountDownLatch countDownLatch;

    private int duration;

    public DevTeam(CountDownLatch countDownLatch, String name, int duration) {
        super(name);
        this.countDownLatch = countDownLatch;
        this.duration = duration;
    }

    @Override
    public void run() {
        System.out.println("Task assigned to dev team " + Thread.currentThread().getName());

        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task  finished by dev team " + Thread.currentThread().getName());
        countDownLatch.countDown();
    }
}
