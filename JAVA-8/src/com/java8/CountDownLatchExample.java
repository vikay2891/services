package com.java8;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author vikas.bhardwaj3
 * 2/15/20209:19 PM2020
 */
public class CountDownLatchExample {


    public static void main(String[] args) throws InterruptedException {

       /* ExecutorService executorService = Executors.newFixedThreadPool(3);
        CountDownLatch countDownLatch = new CountDownLatch(3);
        executorService.submit(new DevTeam(countDownLatch, "DEV-TEAM", 200));
        executorService.submit(new UiTeam(countDownLatch, 100, "UI-TEAM"));
        countDownLatch.await();
        executorService.submit(new QaTeam(100, "QA-TEAM"));
        System.out.println("All dependent executorService intialized");*/

        CountDownLatch countDownLatch = new CountDownLatch(3);
        DevTeam devTeam = new DevTeam(countDownLatch, "DEV-TEAM", 100);

        UiTeam uiTeam = new UiTeam(countDownLatch, 10, "UI_TEAM");

        devTeam.start();
        uiTeam.start();
        countDownLatch.countDown();

     // try to reuse   DevTeam devTeam1 = new DevTeam(countDownLatch, "DEV-TEAM1adeqweqweqw", 100);
        QaTeam qaTeam = new QaTeam(100, "QA-TEAM");
        qaTeam.start();

    }
}
