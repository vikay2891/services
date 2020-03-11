package com.java8;

import java.util.HashMap;

/**
 * @author vikas.bhardwaj3
 * 1/28/20206:50 PM2020
 */
public class CountDuplicateInjava {

    public static void main(String[] args) {

        String s = "VIKAS VIKAS";
        char[] ch = s.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char c : ch) {
            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c) + 1);
            } else {
                hm.put(c, 1);
            }
        }
        for(char c:hm.keySet()){
            if(hm.get(c)>1){
                System.out.println(c+ " "+hm.get(c));
            }

        }

    }

}
