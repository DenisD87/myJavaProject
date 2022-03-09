package school.lesson2;

import java.util.Arrays;

public class HomeWorkFifthTask {
    public static void main(String[] args) {
        replaceArrayElements();
    }

    public static void replaceArrayElements() {
        int arr[] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
