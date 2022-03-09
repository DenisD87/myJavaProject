package school.lesson3;

public class ThirdHomeWorkApp {
    public static void main(String[] args) {
        Employee[] employees = createEmployeesArray();
        filterEmployeesArray(employees);
    }

    public static Employee[] createEmployeesArray() {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Ivanov Ivan", "Engineer", "ivanov@mailbox.com", "892312312", 1000, 20);
        employees[1] = new Employee("Petrov Petr", "Driver", "petrov@mailbox.com", "923123128", 2000, 30);
        employees[3] = new Employee("Antonov Anton", "QA Engineer", "antonov@mailbox.com", "312312892", 3000, 40);
        employees[2] = new Employee("Sidorov Sergey", "Developer", "sidorov@mailbox.com", "231231289", 4000, 50);
        employees[4] = new Employee("Nikitin Nikita", "System Analyst", "nikitin@mailbox.com", "123128923", 5000, 60);

        return employees;
    }

    public static void filterEmployeesArray(Employee[] employees) {
//        Как вариант, забегая вперед...
//        Arrays.stream(employees).filter(o -> o.getAge() >= 40).forEach(o -> o.info());
        for (Employee element : employees) {
            if (element.getAge() >= 40) {
                element.info();
            }
        }
    }
}
