package com.Hashtable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;

/**
 * @author vikas.bhardwaj3
 * 3/7/20207:56 PM2020
 */
public class FindDuplicatePositionKth {

    static boolean checkDuplicatesWithinK(int arr[], int k)
    {
        // Creates an empty hashset
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer>arrayList = new ArrayList<>();

        // Traverse the input array
        for (int i=0; i<arr.length-k; i++)
        {
            // If already present n hash, then we found
            // a duplicate within k distance
            if(arrayList.contains(arr[i])){
                return  true;
            }

            arrayList.add(arr[i]);

        }
        return false;
    }

    // Driver method to test above method
    public static void main (String[] args)
    {
        int arr[] = {10, 5, 3, 4, 8,5, 6};
        if (checkDuplicatesWithinK(arr, 2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}