package school.lesson5.fruits;

public enum Fruits {
    APPLE(1.0f), ORANGE(1.5f);

    private float weight;

    Fruits (float weight) {
        this.weight = weight;
    }

    public float getFruitWeight() {
        return weight;
    }
}
