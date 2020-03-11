package com.string;

/**
 * @author vikas.bhardwaj3
 * 3/7/202010:11 AM2020
 */
public class CompressString {


    public static String compress(String str) {

        StringBuilder result = new StringBuilder();
        char[] arr = str.toCharArray();
        int current = 0;
        int index = 0;
        int ocurence = 0;
        for (int i = 0; i < str.length(); i++) {
            if (arr[current] == arr[index]) {
                current++;
            } else {
                ocurence = current - index;
                if (ocurence > 1) {
                    result.append(arr[index]).append(ocurence);
                } else
                    result.append(arr[index]);
                index = current;
                current++;
            }
        }
        ocurence = current - index;
        if (ocurence > 1) {
            result.append(arr[index]).append(ocurence);
        } else {
            result.append(arr[index]);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String string = "baaaaccdkksssssklpp";
        System.out.println(compress(string));

    }
}

