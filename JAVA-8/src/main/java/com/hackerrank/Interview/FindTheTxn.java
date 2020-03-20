package com.hackerrank.Interview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author vikas.bhardwaj3
 * 3/14/202011:51 AM2020
 */
public class FindTheTxn {

    public static void main(String[] args) {

        List<String> listOfTxn = new ArrayList<>();
        listOfTxn.add("tan");
        listOfTxn.add("bin");
        listOfTxn.add("tan");
        listOfTxn.add("keyboard");
        listOfTxn.add("mouse");
        System.out.print(countTransaction(listOfTxn));
    }

    private static List<String> countTransaction(List<String> stringList) {
        List<String> result = new ArrayList<>();

        HashMap<String, Integer> hm = new HashMap<>();

        for (String key : stringList) {
            if (hm.containsKey(key)) {
                hm.put(key, hm.get(key) + 1);
            } else {
                hm.put(key, 1);
            }
        }

        hm.entrySet().stream().sorted(Comparator.comparing(e -> e.getKey())).map(e -> result.add(e.getKey() + " " + e.getValue())).collect(Collectors.toList());
        return result;

    }


}
