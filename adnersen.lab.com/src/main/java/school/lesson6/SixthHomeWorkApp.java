package school.lesson6;

public class SixthHomeWorkApp {
    public static int convertAndSumArrayElements(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;

        if (arr.length != 4) {
            throw new MyArraySizeException();
        } else {
            for (String[] rows : arr) {
                if (rows.length != 4) {
                    throw new MyArraySizeException();
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].matches("\\D*")) {
                    throw new MyArrayDataException("Element " + arr[i][j] + " is contained in [" + i + "][" + j + "]");
                } else {
                    sum += Integer.parseInt(arr[i][j]);
                }
            }
        }

        return sum;
    }

    public static void handlingExceptions(String[][] arr) {
        try {
            System.out.println("Sum of all array elements: " + convertAndSumArrayElements(arr));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
// 4х4 целочисленные значения
        String[][] firstStringArray = new String[][]{{"11", "12", "13", "14"}, {"21", "22", "23", "24"}, {"31", "32", "33", "34"}, {"41", "42", "43", "44"}};
        handlingExceptions(firstStringArray);

// 2х3
        String[][] secondStringArray = new String[][]{{"11", "12", "13"}, {"21", "22", "23"}};
        handlingExceptions(secondStringArray);

// 4х3
        String[][] thirdStringArray = new String[][]{{"11", "12", "13"}, {"21", "22", "23"}, {"31", "qwe", "33"}, {"41", "42", "43"}};
        handlingExceptions(thirdStringArray);

// 4 строки, в 3 строке 3 элемента
        String[][] fourthStringArray = new String[][]{{"11", "12", "13", "14"}, {"21", "22", "23", "24"}, {"31", "32", "33"}, {"41", "42", "43", "44"}};
        handlingExceptions(fourthStringArray);

// 4х4 содержит не число
        String[][] fifthStringArray = new String[][]{{"11", "12", "13", "14"}, {"21", "22", "23", "24"}, {"31", "32", "qwe", "34"}, {"41", "42", "43", "44"}};
        handlingExceptions(fifthStringArray);
    }
}