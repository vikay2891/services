package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author vikas.bhardwaj3
 * 3/15/20207:45 PM2020
 */
public class Test {

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
}
