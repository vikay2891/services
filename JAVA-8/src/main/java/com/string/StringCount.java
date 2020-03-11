package com.string;

import java.util.HashMap;

/**
 * @author vikas.bhardwaj3
 * 2/28/20206:19 PM2020
 */
public class StringCount {

    public static void main(String[] args) {

        String s = "viiiikasvikass";
        char arr [] =s.toCharArray();
        HashMap<Character, Integer> hm  = new HashMap<>();
        for(Character ch: arr){

            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            } else
                hm.put(ch,1);
        }
        System.out.println(hm);

    }
}
