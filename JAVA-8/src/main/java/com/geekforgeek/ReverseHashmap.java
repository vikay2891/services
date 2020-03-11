package com.geekforgeek;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author vikas.bhardwaj3
 * 3/7/202011:51 AM2020
 */
public class ReverseHashmap {
    static HashMap<String, Integer> result = new HashMap<>();

    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>();
        HashMap<String, List<String>> reverseHashMap = new HashMap<>();

        hashMap.put("vikas", "aditya");
        hashMap.put("rajni", "aditya");
        hashMap.put("aditya", "tarun");
        hashMap.put("girish", "mahesh");
        hashMap.put("mahesh", "tarun");
        hashMap.put("tarun", "tarun");
        System.out.println(hashMap);

        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            String emp = entry.getKey();
            String mgr = entry.getValue();
            if (!emp.equals(mgr)) {

                List<String> directReportList = reverseHashMap.get(mgr);

                if (directReportList == null) {
                    directReportList = new ArrayList<>();
                    reverseHashMap.put(mgr, directReportList);
                }
                directReportList.add(emp);

            }
            //    System.out.println("" + reverseHashMap);
        }
        System.out.println("rev" + reverseHashMap);
        for (String mgr : hashMap.keySet()) {

            getHierarchy(mgr, reverseHashMap);
        }
        System.out.println("res" + result);
    }

    private static int getHierarchy(String mgr, HashMap<String, List<String>> reverseHashMap) {

        int count = 0;

        if (!reverseHashMap.containsKey(mgr)) {
            result.put(mgr, 0);
            return 0;
        } else if (result.containsKey(mgr)) {
            count = result.get(mgr);
        } else {
            List<String> directEmployeeReportList = reverseHashMap.get(mgr);
            count = directEmployeeReportList.size();
            for (String employee : directEmployeeReportList)
                count += getHierarchy(employee, reverseHashMap);
            result.put(mgr, count);

        }
        return count;
    }
}
