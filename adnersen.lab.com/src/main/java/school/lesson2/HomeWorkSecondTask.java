package school.lesson2;

public class HomeWorkSecondTask {
    public static void main(String[] args) {
        printPositiveOrNegativeNumber(-1);
        printPositiveOrNegativeNumber(0);
        printPositiveOrNegativeNumber(1);
    }

    public static void printPositiveOrNegativeNumber(int a) {
        System.out.println(a >= 0 ? "Число положительное" : "Число отрицательное");
    }
}
