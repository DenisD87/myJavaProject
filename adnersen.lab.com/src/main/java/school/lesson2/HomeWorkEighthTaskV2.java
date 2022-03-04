package school.lesson2;

import java.util.Arrays;
import java.util.Scanner;

// Еще один вариант (:

public class HomeWorkEighthTaskV2 {
    public static void main(String[] args) {
        fillArrayDiagonally(enterArraySize());
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

    public static int enterArraySize() {
        Scanner in;
        int length = 0;
        String str = "";

        do {
            System.out.print("Enter the size of the array: ");
            in = new Scanner(System.in);
            try {
                str = in.nextLine();
                length = Integer.parseInt(str);
            } catch (Exception e) {
                System.out.println("Input error!!!");
            }
        } while (!str.matches("\\d*"));

        in.close();
        return length;
    }
}
