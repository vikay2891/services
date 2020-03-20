package com.thread;

import java.sql.Connection;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author vikas.bhardwaj3
 * 3/15/20207:13 PM2020
 */
public class ConsumerProducerOrThreadPool {

    private final int capacity = 5;
    Queue<Integer> queue = new LinkedList<>();
    private Lock lock = new ReentrantLock();
    private Condition notEmpty = lock.newCondition();
    private Condition notFull = lock.newCondition();

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        ConsumerProducerOrThreadPool cusConsumerProducerOrThreadPool = new ConsumerProducerOrThreadPool();
        Runnable producerTask = () -> {
            while (true) {
                try {
                    cusConsumerProducerOrThreadPool.producer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable consumerTask = () -> {
            while (true) {
                try {
                    cusConsumerProducerOrThreadPool.consumer();
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
            }
        };
        executorService.submit(producerTask);
        executorService.submit(consumerTask);

    }

    public void producer() throws InterruptedException {
        try {
            lock.lock();
            if (queue.size() == capacity) {
                notFull.await();
            }
            Random random = new Random();
            int item = random.nextInt(100);
            queue.add(item);
            System.out.println("Item Produces = " + item);
            Thread.sleep(1000);
            notEmpty.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void consumer() throws InterruptedException {

        try {
            lock.lock();
            while (queue.size() == 0) {
                notEmpty.await();
            }
            int item = queue.remove();
            System.out.println("item consumed = " + item);
            Thread.sleep(1000);
            notFull.signalAll();
        } finally {
            lock.unlock();
        }
    }
}
