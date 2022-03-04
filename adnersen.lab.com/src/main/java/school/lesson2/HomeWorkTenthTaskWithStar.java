package school.lesson2;

import java.util.Arrays;

public class HomeWorkTenthTaskWithStar {
    public static void main(String[] args) {
        shiftArrayElements(new int[]{1, 2, 3}, 1);
        shiftArrayElements(new int[]{1, 2, 3}, -1);
        shiftArrayElements(new int[]{3, 5, 6, 1}, -2);
        shiftArrayElements(new int[]{3, 5, 6, 1}, 10);
        shiftArrayElements(new int[]{3, 5, 6, 1}, 0);
    }

    public static void shiftArrayElements(int[] arr, int shift) {
        int length = arr.length;
        shift = (length + shift > length) ? (length + shift) % length : shift; //находим на сколько сдвигать

        if (shift > 0) {
            for (int i = 0; i < shift; i++) {
                int tempValue = arr[length - 1];
                for (int j = 1; j < length; j++) {
                    arr[length - j] = arr[length - j - 1];
                }
                arr[0] = tempValue;
            }
        } else if (shift < 0) {
            for (int i = 0; i > shift; i--) {
                int tempValue = arr[0];
                for (int j = length - 1; j  > 0; j--) {
                    arr[length - j - 1] = arr[length - j];
                }
                arr[length - 1] = tempValue;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
