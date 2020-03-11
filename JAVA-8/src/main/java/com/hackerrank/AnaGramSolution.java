package com.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AnaGramSolution {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {

        char[] arr = a.toCharArray();
        StringBuilder stringBuilder = new StringBuilder(b);
        int count = 0;

        for (char c : arr) {

            int index = stringBuilder.indexOf("" + c);
            if (index != -1) {
                stringBuilder = stringBuilder.deleteCharAt(index);

            } else {
                count++;
            }

        }


        return count;
    }

    public static void main(String[] args) throws IOException {
        //   BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        String b = sc.nextLine();

        int res = makeAnagram(a, b);

       /* bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();
*/
        scanner.close();
    }
}
