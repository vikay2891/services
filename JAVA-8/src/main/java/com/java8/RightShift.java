package com.java8;

/**
 * @author vikas.bhardwaj3
 * 3/18/20205:22 PM2020
 */
public class RightShift {
    public static void main(String[] args) {

        char[] inputArray = {'c', ' ', ' ', 'd', ' ', 'e'};


        char[] result = shiftChar(inputArray);
        System.out.println(result);
        System.out.println(result.length);

    }

    private static char[] shiftChar(char[] inputArray) {

        char temp;
        int i = 0;
        for (int j = 0; j < inputArray.length; j++) {
            if (inputArray[j] != ' ') {
                temp = inputArray[i];
                inputArray[i] = inputArray[j];
                inputArray[j] = temp;
                i++;
            }

        }
        return inputArray;
    }

}
