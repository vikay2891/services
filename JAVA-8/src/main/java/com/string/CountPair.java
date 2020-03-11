package com.string;

import java.util.HashMap;

/**
 * @author vikas.bhardwaj3
 * 2/28/20206:42 PM2020
 */
public class CountPair {
    public static void main(String[] args) {

        int arr[] = {4, 3, 4, 6, 2, 7, 1};
        int sum = 8;

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!hm.containsKey(arr[i])) {
                hm.put(sum - arr[i], arr[i]);
                System.out.println(hm);
            } else if (hm.containsKey(arr[i])) {
                System.out.println(arr[i] + "," + hm.get(arr[i]));
            }
        }
    }
}
