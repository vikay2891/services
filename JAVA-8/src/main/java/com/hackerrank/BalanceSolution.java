package com.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BalanceSolution {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the isBalanced function below.
    static String isBalanced(String s) {

        char arr[] = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (Character ch : arr) {
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.add(ch);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                }
                if (checkBracket(stack.peek()) != ch) {
                    return "NO";
                }
                stack.pop();
            }
        }

        return stack.isEmpty() ? "YES" : "NO";
    }

    private static char checkBracket(final char b) {
        if (b == '{') {
            return '}';
        }
        if (b == '[') {
            return ']';
        }
        return ')';

    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
     /*   BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {*/
            String s = scanner.nextLine();

            String result = isBalanced(s);

          /*  bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();*/

        scanner.close();
    }
}
