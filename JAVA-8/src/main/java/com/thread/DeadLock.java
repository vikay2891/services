package com.thread;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author vikas.bhardwaj3
 * 3/15/20204:50 PM2020
 */
public class DeadLock {

    private static Lock lockA = new ReentrantLock();
    private static Lock lockB = new ReentrantLock();


    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(new Thread(() -> processThis()));
        executorService.submit(new Thread(() -> processThat()));
    }

    public static void processThis() {
        lockA.lock();
        System.out.println("ji");
        lockB.lock();
        System.out.println("hj");
/*
        lockA.unlock();
        lockB.unlock();*/

    }

    public static void processThat() {
        lockB.lock();
        System.out.println("asas");
        lockA.lock();
        System.out.println("asaassasasa");
       /* lockB.unlock();
        lockA.unlock();*/

    }

    private static void detectDeadlock() {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        long[] threadIds = threadMXBean.findDeadlockedThreads();
        boolean deadLock = threadIds != null && threadIds.length > 0;
        System.out.println("deadLock found" + deadLock);
    }
}
