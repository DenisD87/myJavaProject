package school.lesson4.catsanddogs;

public class Dog extends Animal {
    private static int counter;

    public Dog(String name, int restrictionRun, int swimmingRestriction) {
        super(name, restrictionRun, swimmingRestriction);
        counter++;
    }

    public static void checkCounter() {
        System.out.println(counter + " copies of " + Dog.class.getSimpleName() + " were created");
    }
}
