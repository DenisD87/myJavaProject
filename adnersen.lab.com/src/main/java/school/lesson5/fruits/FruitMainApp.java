package school.lesson5.fruits;

public class FruitMainApp {
    public static void main(String[] args) {
        Box<Apple> box1 = new Box<>();
        for (int i = 0; i < 5; i++) {
            box1.addFruit(new Apple());
        }
        System.out.println("box1 weight: " + box1.getWeight());

        Box<Orange> box2 = new Box<>();
        for (int i = 0; i < 3; i++) {
            box2.addFruit(new Orange());
        }

// проверка что в копробу не можем добавить другой фрукт
// ожидание ссоотвествует действительности - компилятор ругается, все ок
//        box2.addFruit(new Apple());
        System.out.println("box2 weight: " + box2.getWeight());
        System.out.println("box1 = box2: " + box1.compare(box2));
        System.out.println();

        box1.addFruit(new Apple());
        box2.addFruit(new Orange());
        System.out.println("box1 weight: " + box1.getWeight());
        System.out.println("box2 weight: " + box2.getWeight());
        System.out.println("box1 = box2: " + box1.compare(box2));
        System.out.println();

// проверка что мы действительно не можем пересытать Апельсины к Яблокам:
// ожидание ссоотвествует действительности - компилятор ругается, все ок
//        box1.moveFruit(box2);

        Box<Apple> box3 = new Box<>();
        box3.addFruit(new Apple());
        System.out.println("box1 weight: " + box1.getWeight());
        System.out.println("box3 weight: " + box3.getWeight());
        box1.moveFruit(box3);
        System.out.println("box1 weight: " + box1.getWeight());
        System.out.println("box3 weight: " + box3.getWeight());
        box1.moveFruit(box3);
        System.out.println("box1 weight: " + box1.getWeight());
        System.out.println("box3 weight: " + box3.getWeight());
    }
}
