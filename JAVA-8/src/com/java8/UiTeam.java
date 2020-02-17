package com.java8;

import java.util.concurrent.CountDownLatch;

/**
 * @author vikas.bhardwaj3
 * 2/15/20209:15 PM2020
 */
public class UiTeam extends Thread {

    private CountDownLatch countDownLatch;
    private int duration;
    public UiTeam(CountDownLatch countDownLatch, int duration, String name) {
        super(name);
        this.countDownLatch = countDownLatch;
        this.duration = duration;

    }

    @Override
    public void run() {
        System.out.println("Ui team task assigned ");

        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ui Task finshed");
        countDownLatch.countDown();
    }
}
