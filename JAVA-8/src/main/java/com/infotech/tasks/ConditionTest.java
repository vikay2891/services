package com.infotech.tasks;

import java.util.Random;
import java.util.Stack;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author vikas.bhardwaj3
 * 2/16/20209:42 PM2020
 */

class ProducerConsumer {

    private final int capacity = 5;
    private Stack<Integer> stack = new Stack<>();
    private Lock lock = new ReentrantLock();
    private Condition stackEmptyCondition = lock.newCondition();
    private Condition stackFullCondition = lock.newCondition();

    public void pushToStack() throws InterruptedException {

        try {
            lock.lock();
            while (stack.size() == capacity) {
                stackFullCondition.await();
            }
            Random random = new Random();
            int item = random.nextInt(100);
            stack.push(item);
            System.out.println("Produced Item " + item);
            Thread.sleep(100);
            stackEmptyCondition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void popFromStack() throws InterruptedException {

        try {
            lock.lock();
            while (stack.size() == 0) {
                stackEmptyCondition.await();
            }
            Integer item = stack.pop();
            System.out.println("Item consumed " + item);
            Thread.sleep(100);
            stackFullCondition.signalAll();
        } finally {
            lock.unlock();
        }
    }

}

public class ConditionTest {


    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

         ProducerConsumer producerConsumer = new ProducerConsumer();

        Runnable producerTask = () -> {
            while (true) {

                try {
                    producerConsumer.pushToStack();
                } catch (InterruptedException e) {

                }
            }
        };
      Runnable consumerTask =() ->{
          while(true){
              try{
                  producerConsumer.popFromStack();
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }

      };
      executorService.submit(producerTask);
      executorService.submit(consumerTask);
    }


}



