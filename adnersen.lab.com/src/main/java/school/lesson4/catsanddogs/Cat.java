package school.lesson4.catsanddogs;

public class Cat extends Animal {
    private static int counter;

    public Cat(String name, int restrictionRun, int swimmingRestriction) {
        super(name, restrictionRun, swimmingRestriction);
        counter++;
    }

    public static void checkCounter() {
        System.out.println(counter + " copies of " + Cat.class.getSimpleName() + " were created");
    }
}
