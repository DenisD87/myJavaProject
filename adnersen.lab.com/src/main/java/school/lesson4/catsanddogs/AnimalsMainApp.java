package school.lesson4.catsanddogs;

public class AnimalsMainApp {
    public static void main(String[] args) {
        Dog tuzik = new Dog("Tuzik", 500, 10);
        Dog bobik = new Dog("Bobik", -500, -10);

        Cat barsik = new Cat("Barsik", 200, 0);

        System.out.println();

        Dog.checkCounter();
        Cat.checkCounter();
        Animal.checkCounter();

        System.out.println();

        tuzik.run(150);

        System.out.println();

        bobik.swim(4);
        bobik.swim(-4);

        System.out.println();

        barsik.swim(5);
        barsik.run(300);
    }
}
