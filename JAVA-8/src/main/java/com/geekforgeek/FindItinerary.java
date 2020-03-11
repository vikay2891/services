package com.geekforgeek;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author vikas.bhardwaj3
 * 3/7/20209:55 PM2020
 */
public class FindItinerary {

    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Chennai", "Bangalore");
        hashMap.put("Bombay", "Delhi");
        hashMap.put("Goa", "Chennai");
        hashMap.put("Delhi", "Goa");

        String start = null;
        HashMap<String, String> reverseHashmap = (HashMap<String, String>) hashMap.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
        //  hashMap.entrySet().stream().forEach(stringStringEntry -> reverseHashmap.put(stringStringEntry.getValue(), stringStringEntry.getKey()));
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {

            if (!reverseHashmap.containsKey(entry.getKey())) {
                start = entry.getKey();
                break;
            }
        }

        String to = hashMap.get(start);
        while (to != null) {
            System.out.println(start + "->" + to + ",");
            start = to;
            to = hashMap.get(to);

        }


    }
}
