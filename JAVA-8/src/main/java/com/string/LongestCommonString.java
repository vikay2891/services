package com.string;

/**
 * @author vikas.bhardwaj3
 * 3/8/202010:43 PM2020
 */
public class LongestCommonString {
    public static void main(String[] args) {

        String[] str = {"flower"};
        System.out.println(longestCommonPrefix(str));

    }


    public static String longestCommonPrefix(String[] strs) {
        int count =0;
        int length =strs.length;
        if(length==1){
            return strs[0];
        }
        String result = "";
        for (int i = 0; i < length-1 ; i++) {

            if (strs[i].substring(0, 2).equals(strs[i + 1].substring(0, 2))) {
                count++;
                result = strs[i].substring(0, 2);
            }
        }
        return result;
    }

}

