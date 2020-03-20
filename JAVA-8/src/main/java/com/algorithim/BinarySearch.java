package com.algorithim;

/**
 * @author vikas.bhardwaj3
 * 3/19/202010:28 AM2020
 */
public class BinarySearch {

    public static void main(String[] args) {

        int[] inputArray = {5, 9, 17, 23, 25, 45, 59, 63, 71, 89};
        int n = inputArray.length;
        int data = 59;

        binarySearch(inputArray, n, data);

    }

    public static int binarySearch(int[] array, int n, int data) {
        int left = array[0];
        int right = array[n - 1];

        while (left < right) {
            int mid = left + right / 2;
            if (data == mid) {
                return mid;

            } else if (data < array[mid]) {


            }

        }

    }
}
