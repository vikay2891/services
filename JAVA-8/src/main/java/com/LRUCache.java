package com;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * @author vikas.bhardwaj3
 * 3/11/20208:19 PM2020
 */
public class LRUCache {

    static Deque<Integer> deque;
    static HashSet<Integer> hashmap;
    int cacheSize;

    LRUCache(int n) {
        deque = new LinkedList<>();
        hashmap = new HashSet<>();
        cacheSize = n;
    }


    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(3);
        lruCache.refer(1);
        lruCache.refer(2);
        lruCache.refer(3);
        lruCache.refer(1);
        lruCache.refer(4);
        lruCache.refer(5);

    }

    private void refer(int i) {
        if (!hashmap.contains(i)) {
            if (deque.size() == cacheSize) {
                int last = deque.removeLast();
                hashmap.remove(last);
            } else {
                /*int index = 0;
                i = 0;*/
                deque.stream().map(element -> element);
            }

        }
        deque.push(i);
        hashmap.add(i);
    }

    /*public void refer1(int x) {
        if (!map.contains(x)) {
            if (dq.size() == csize) {
                int last = dq.removeLast();
                map.remove(last);
            }
        } else {
            *//* The found page may not be always the last element, even if it's an
               intermediate element that needs to be removed and added to the start
               of the Queue *//*
            int index = 0, i = 0;
            Iterator<Integer> itr = dq.iterator();
            while (itr.hasNext()) {
                if (itr.next() == x) {
                    index = i;
                    break;
                }
                i++;
            }
            dq.remove(index);
        }
        dq.push(x);
        map.add(x);
    }*/
}
