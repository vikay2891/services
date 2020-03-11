package com.concurrent;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author vikas.bhardwaj3
 * 2/26/20208:53 PM2020
 */
public class MyThread1 {//extends Thread {

  /*  static ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();

    public static void main(String[] args) throws InterruptedException {
        concurrentHashMap.put(101, "md");
        concurrentHashMap.put(103, "kd");
        concurrentHashMap.put(104, "vdd");

        MyThread1 myThread1 = new MyThread1();
        myThread1.start();
        Set s = concurrentHashMap.keySet();
        Iterator iterator = s.iterator();
        while (iterator.hasNext()) {
            Integer integer = (Integer) iterator.next();
            System.out.println("main thread " + integer + "  " + concurrentHashMap.get(integer));
            Thread.sleep(3000);
        }

        System.out.println(concurrentHashMap);

    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("child thread updated");
        concurrentHashMap.put(106, "vikas");
    }*/


    public static void main(String[] args) {

        System.out.println(compresseMessage("abbcdddfsddcs"));
    }

    public static String compresseMessage(String message){
        char [] arr =message.toCharArray();

        Stack<Character> stack = new Stack<>();

        StringBuilder compressedMessage = new StringBuilder();

        for(Character messageChar : arr){

            if(stack.size() == 0){
                stack.add(messageChar);
            }else{

                Character topChar = stack.peek();
                if(topChar.equals(messageChar)){
                    stack.add(messageChar);
                }else{
                    int occurance = stack.size();
                    if(occurance > 1) {
                        compressedMessage.append(topChar).append(occurance);
                        stack.clear();
                        stack.add(messageChar);
                    }else {
                        compressedMessage.append(topChar);
                        stack.clear();
                        stack.add(messageChar);
                    }
                }
            }
        }
        if(stack.size() > 0) {
            compressedMessage.append(stack.peek());
        }
        return compressedMessage.toString();
    }


}
