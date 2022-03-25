package school.lesson8;

public class EighthHomeWorkSecondTaskApp {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

// format +XXX (XX) XXX XX XX
        phonebook.add("111111111111", "Ivanov");
// фамилия будет перезаписана
        phonebook.add("111111111111", "Petrov");
        phonebook.add("222222222222", "Petrov");
        phonebook.add("333333333333", "Sidorov");
        phonebook.add("444444444444", "Petrov");
        phonebook.add("555555555555", "Ivanov");
        phonebook.add("666666666666", "Petrov");
        phonebook.add("777777777777", "Ivanov");
        phonebook.add("+888 (88) 888 88 88", "Sidorov");
        phonebook.add("999999999999", "Ivanov");
        phonebook.add("9999-99999", "Titov");
        phonebook.add("asd", "Titov");
        phonebook.add("", "Titov");

        phonebook.get("Petrov");
        System.out.println("------------------");
        phonebook.get("Ivanov");
        System.out.println("------------------");
        phonebook.get("Sidorov");
        System.out.println("------------------");
        phonebook.get("Titov");
    }
}
