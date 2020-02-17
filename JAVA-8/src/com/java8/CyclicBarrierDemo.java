package com.java8;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author vikas.bhardwaj3
 * 2/15/202012:36 PM2020
 */
class Passanger implements Runnable {

    private int duration;
    private CyclicBarrier cyclicBarrier;

    public Passanger(int duration, CyclicBarrier cyclicBarrier) {
        this.duration = duration;
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(duration);

            System.out.println(Thread.currentThread().getName() +"is arrived");
           int await= cyclicBarrier.await();
            if(await==0){
                System.out.println("Four Passenget is arriave dso cab is going to start");
            }
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }

    }
}

public class CyclicBarrierDemo {

    public static void main(String[] args) throws InterruptedException {

        System.out.println(Thread.currentThread().getName() + " has started");

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        CyclicBarrier cyclicBarrier = new CyclicBarrier(4);
        executorService.submit(new Passanger(1000,cyclicBarrier));
        executorService.submit(new Passanger(10,cyclicBarrier));
        executorService.submit(new Passanger(100,cyclicBarrier));
        executorService.submit(new Passanger(200,cyclicBarrier));

        System.out.println(Thread.currentThread().getName() + " has finshed");
        System.out.println("done with initial set of threads, starting again reusing the same cyclicbarrier object");
        executorService.submit(new Passanger(204440,cyclicBarrier));
        executorService.submit(new Passanger(20440,cyclicBarrier));
        System.out.println("after using recycle cyclicBarrier");

    }


}
