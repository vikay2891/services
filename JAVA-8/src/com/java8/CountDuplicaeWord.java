package com.java8;

import java.util.HashMap;

/**
 * @author vikas.bhardwaj3
 * 1/28/20207:23 PM2020
 */
public class CountDuplicaeWord {

    public static void main(String[] args) {
        String s = "vikas vikas java j";
        String[] strArray = s.split("\\s+");
        HashMap<String, Integer> hm = new HashMap<>();
        for (String s1 : strArray) {

            if(hm.containsKey(s1)){
                hm.put(s1,hm.get(s1)+1);
            }else {
                hm.put(s1,1);
            }
        }
        for(String s1:hm.keySet()){
            if(hm.get(s1)>1){
                System.out.println(s1 + " " + hm.get(s1));
            }
        }

    }
}
