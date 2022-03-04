package school.lesson2;

public class HomeWorkFourthTaskWithStar {
    public static void main(String[] args) {
        System.out.println(checkLeapYear(4));
        System.out.println(checkLeapYear(2020));
        System.out.println(checkLeapYear(100));
        System.out.println(checkLeapYear(200));
        System.out.println(checkLeapYear(400));
        System.out.println(checkLeapYear(2000));
        System.out.println(checkLeapYear(3));
    }

// Из задания не ясно:
// А 0 год является ли високосным?
// И что с отрицательными годами?

    public static boolean checkLeapYear(int yearNumber) {
        boolean isALeapYear = false;

        if (yearNumber % 4 == 0) {
            if (yearNumber % 400 == 0) {
                isALeapYear = true;
            } else if (yearNumber % 100 == 0) {
                isALeapYear = false;
            } else {
                isALeapYear = true;
            }
        } else isALeapYear = false;

        return isALeapYear;
    }
}
