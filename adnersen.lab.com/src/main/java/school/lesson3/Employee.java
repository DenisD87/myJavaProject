package school.lesson3;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    Employee(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

//  При необходимости (изменении условия задания) можно добавить геттеры и сеттеры ко всем полям
    public int getAge() {
        return age;
    }

//    Если в будущем будет необходимость сравнивать объекты, то надо будет переопределить методы equals и hashCode
//    Как вариант можно переопределить метод toString
    public void info() {
        System.out.println("Full name: " + fullName);
        System.out.println("position: " + position);
        System.out.println("email: " + email);
        System.out.println("phone number: " + phoneNumber);
        System.out.println("salary: " + salary);
        System.out.println("age: " + age);
        System.out.println();
    }
}
