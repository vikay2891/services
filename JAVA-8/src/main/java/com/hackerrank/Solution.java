package com.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the abbreviation function below.
    static void  abbreviation(String a, String b) {

        char[] arr = a.toUpperCase().toCharArray();
        StringBuilder stringBuilder = new StringBuilder(b);
        Stack<Character> stack = new Stack<>();
        for (char ch : arr) {
            int index = stringBuilder.indexOf("" + ch);
            if (index != -1) {
                stack.add(ch);
            }
        }

    }


    public static void main(String[] args) throws IOException {
        /* BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));*/
        //   BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        String b = sc.nextLine();
         abbreviation(a, b);

       /* bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();
*/
        scanner.close();
    }
}
