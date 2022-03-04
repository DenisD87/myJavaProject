package school.lesson2;

import java.util.Arrays;

public class HomeWorkEighthTask {
    public static void main(String[] args) {
        fillArrayDiagonally(10);
    }

    public static void fillArrayDiagonally(int length) {
        int[][] arr = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i == j) {
                    arr[i][j] = 1; //00 11 22 и тд
                }
                if (j == (length - 1 - i)) {
                    arr[i][j] = 1; //09 18 27 и тд
                }
            }
        }

        for (int[] line : arr) {
            System.out.println(Arrays.toString(line));
        }
    }
}
