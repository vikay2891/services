package com.java8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * @author vikas.bhardwaj3
 * 2/19/20209:38 PM2020
 */
public class Collection {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(null);
        al.add(15);
        al.add(17);
        al.add(17);
        al.add(null);
        al.add(null);

        al.add(18);
        System.out.println("al = " + al);

        LinkedList<Integer> al2 = new LinkedList<>();
        al2.add(12);
        al2.add(null);
        al2.add(15);
        al2.add(17);
        al2.add(17);
        al2.add(null);
        al2.add(null);
        al2.add(18);
        System.out.println("ln = " + al2);

        HashSet<Integer> hashSet = new HashSet<>(al2);
        hashSet.add(12);
        hashSet.add(13);
        hashSet.add(14);
        hashSet.add(15);
        System.out.println(hashSet);

    }
}
