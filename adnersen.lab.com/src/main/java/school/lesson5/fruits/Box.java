package school.lesson5.fruits;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    public List<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public float getWeight() {
        float boxWeight = 0f;
        if (!fruits.isEmpty()) {
            Fruits fruit = Fruits.valueOf(fruits.get(0).getClass().getSimpleName().toUpperCase());
            boxWeight = fruits.size() * fruit.getFruitWeight();
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
