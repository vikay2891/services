package com.string;

import java.util.HashMap;

/**
 * @author vikas.bhardwaj3
 * 2/28/20206:30 PM2020
 */
public class CountElement {
    public static void main(String[] args) {

        int arr[] ={1,2,1,4,4,5,5,7,8,9,9,};

        HashMap<Integer, Integer> hm = new HashMap<>();
         for (int element :arr){

             if(hm.containsKey(element)){
                 hm.put(element,hm.get(element)+1);
             } else
                 hm.put(element,1);
         }

        System.out.println(hm);
    }
}
