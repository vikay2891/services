package com.Array;

/**
 * @author vikas.bhardwaj3
 * 3/18/202011:22 PM2020
 */
public class RotateArrayRight {

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int index = 2;

        int[] res = rightRotate(arr, index);
        for (int k = 0; k < res.length; k++) {
            System.out.println(res[k]);
        }

    }

    private static int[] rightRotate(int[] arr, int index) {
        int size = arr.length;
        int[] rotatedArr = new int[size];
        for (int i = 0; i < size; i++) {
            int newIndex = (i + size ) % size;
            rotatedArr[newIndex] = arr[i];
        }

        return rotatedArr;
    }
}
