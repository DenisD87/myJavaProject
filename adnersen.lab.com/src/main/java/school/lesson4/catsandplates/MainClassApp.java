package school.lesson4.catsandplates;

public class MainClassApp {
    public static void main(String[] args) {

        Cat[] cats = new Cat[]{
                new Cat("Barsik", 5),
                new Cat("Murzik", 50),
                new Cat("Pushok", 55)
        };

        Plate plate = new Plate(100);

        for (Cat cat : cats) {
            cat.eat(plate);
            plate.info();
        }

        System.out.println();

        for (Cat cat : cats) {
            System.out.println(cat.getName() + " isSatiety " + cat.isSatiety());
        }

        System.out.println();

        plate.info();
        plate.setFood(15);
        plate.info();
    }
}
