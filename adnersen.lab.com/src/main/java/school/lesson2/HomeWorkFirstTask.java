package school.lesson2;

public class HomeWorkFirstTask {
    public static void main(String[] args) {
        System.out.println(checkAmountInLimits(-8, 0));
        System.out.println(checkAmountInLimits(5, 5));
        System.out.println(checkAmountInLimits(6, 9));
        System.out.println(checkAmountInLimits(10, 10));
        System.out.println(checkAmountInLimits(2, 7));
        System.out.println(checkAmountInLimits(10, 11));
    }

    public static boolean checkAmountInLimits(int a, int b) {
        int sum = a + b;
        return (sum >= 10 && sum <= 20);
    }
}
