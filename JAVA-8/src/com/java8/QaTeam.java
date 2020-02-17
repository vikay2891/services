package com.java8;

import java.util.concurrent.CountDownLatch;

/**
 * @author vikas.bhardwaj3
 * 2/15/20209:17 PM2020
 */
public class QaTeam extends Thread {

    private int duration;

    public QaTeam(int duration, String name) {
        super(name);
        this.duration = duration;
    }
    @Override
    public void run() {
        System.out.println("Qa Task started " + Thread.currentThread().getName());
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Qa Task finished" + Thread.currentThread().getName());

    }
}
