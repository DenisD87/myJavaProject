package school.lesson5;

import school.lesson3.Employee;
import school.lesson3.ThirdHomeWorkApp;

import java.util.Arrays;

public class HomeWorkFirstTask {
    public static void main(String[] args) {
        Integer[] intArray = new Integer[]{1, 2, 3, 4, 5};
        String[] strings = new String[]{"one", "two", "three", "four", "five", "six"};

        System.out.println(Arrays.toString(intArray));
        HomeWorkFirstTask.swapArrayElements(intArray, 2, 3);
        System.out.println(Arrays.toString(intArray));
        System.out.println();

        System.out.println(Arrays.toString(strings));
        HomeWorkFirstTask.swapArrayElements(strings, 1, 4);
        System.out.println(Arrays.toString(strings));
        System.out.println();

// для эксперимента поменяем местами объекты массива объектов из 3 ДЗ
        Employee[] employees = ThirdHomeWorkApp.createEmployeesArray();
        for (Employee element : employees) {
            element.info();
        }
        System.out.println("---------------------------------------------------");
        HomeWorkFirstTask.swapArrayElements(employees, 0, 3);
        for (Employee element : employees) {
            element.info();
        }
    }

    public static <T> void swapArrayElements(T[] arr, int firstIndex, int secondIndex) throws ArrayIndexOutOfBoundsException {
        T tempValue = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = tempValue;
    }
}
