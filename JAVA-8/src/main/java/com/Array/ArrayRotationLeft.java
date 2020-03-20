package com.Array;

/**
 * @author vikas.bhardwaj3
 * 3/18/20206:58 PM2020
 */
public class ArrayRotationLeft {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int index = 4;

        int[] res = rightRotate(arr, index);
        for (int k = 0; k < res.length; k++) {
            System.out.println(res[k]);
        }

    }

    private static int[] rightRotate(int[] arr, int index) {
        int size = arr.length;
        int[] rotatedArr = new int[size];
        for (int i = 0; i < size; i++) {
            int newIndex = (i + size - index) % size;
               rotatedArr[newIndex]=arr[i];
        }

        return rotatedArr;
    }


}
