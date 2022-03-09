package school.lesson2;

public class HomeWorkThirdTask {
    public static void main(String[] args) {
        System.out.println(checkNegativeNumber(-1));
        System.out.println(checkNegativeNumber(0));
        System.out.println(checkNegativeNumber(1));
    }

    public static boolean checkNegativeNumber(int a) {
        return a < 0;
    }
}
