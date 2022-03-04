package school.lesson2;

import java.util.Arrays;

public class HomeWorkNinthTaskWithStar {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fillArray(5, 7)));
    }

    public static int[] fillArray(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
// Можно еще так:
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = initialValue;
//        }
        return arr;
    }
}
