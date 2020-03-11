package com.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author vikas.bhardwaj3
 * 1/28/20207:39 PM2020
 */
public class CountDuplicateElement {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 1, 3, 5, 2, 6, 8, 9};

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i : array) {
            if (hm.get(i)==null) {
                hm.put(i, 1);
            } else {
                hm.put(i, hm.get(i)+1);
            }

        }
        System.out.println(" " +hm);
        Set<Map.Entry<Integer, Integer>> entrySet =hm.entrySet();
        for (Map.Entry<Integer,Integer> entr:entrySet) {
            if(entr.getValue()>1){
                System.out.println("Diplicate element " +entr.getKey() + " -found"+entr.getValue());
            }

        }
    }

}

