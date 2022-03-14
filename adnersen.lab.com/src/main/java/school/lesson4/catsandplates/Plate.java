package school.lesson4.catsandplates;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void setFood(int food) {
        this.food += food;
    }

    public void decreaseFood(int n, Cat cat) {
        if (food >= n) {
            food -= n;
            System.out.println(cat.getName() + " ate " + n);
            cat.setSatiety(true);
        } else {
            System.out.println(cat.getName() + " does not have enough food in the plate");
        }
    }

    public void info() {
        System.out.println("left on the plate " + food);
    }
}
