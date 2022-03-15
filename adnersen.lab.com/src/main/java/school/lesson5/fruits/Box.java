package school.lesson5.fruits;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    public List<T> fruits;
    private float boxWeight;

    public Box() {
        this.fruits = new ArrayList<>();
        this.boxWeight = 0f;
    }

    public float getWeight() {
        if (!fruits.isEmpty()) {
            if (fruits.get(0).getClass() == Apple.class) {
                this.boxWeight = fruits.size() * Apple.WEIGHT;
            } else if (fruits.get(0).getClass() == Orange.class) {
                this.boxWeight = fruits.size() * Orange.WEIGHT;
            } else {
// на случай добавления нового класса, наследуемого от фрукта
                System.out.println("Unknown type");
                this.boxWeight = 0f;
            }
        } else {
            this.boxWeight = 0f;
        }
        return boxWeight;
    }

    public boolean compare(Box<?> box) {
        return this.getWeight() == box.getWeight();
    }

    public void moveFruit(Box<T> box) {
        if (!this.fruits.isEmpty()) {
            box.fruits.addAll(this.fruits);
            this.fruits.clear();
        } else {
            System.out.println("Nothing to move");
        }
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }
}
