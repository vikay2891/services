package com.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author vikas.bhardwaj3
 * 1/28/202010:36 PM2020
 */
public class CountDuplicateElementJava8 {
    public static void main(String[] args) {
        int inputArray[] ={1,2,3,4,1,2};

        Set<Integer> uniqueElements = new HashSet<>();

        Set<Integer> duplicateElements =  Arrays.stream(inputArray)
                .filter(i -> !uniqueElements.add(i))
                .boxed()
                .collect(Collectors.toSet());

        System.out.println("duplicate elements "+duplicateElements);
    }
}
