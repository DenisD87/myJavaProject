package school.lesson8;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    private Map<String, String> phonebookMap;

    public Phonebook() {
        this.phonebookMap = new HashMap<>();
    }

    public void add(String phoneNumber, String surname) {
        if (phoneNumber.replaceAll("\\D+", "").length() != 12) {
            System.out.println("You are entering an invalid phone number: ");
            System.out.println("phoneNumber: " + phoneNumber + " | surname: " + surname);
            System.out.println("------------------------------------------");
        } else {
            phonebookMap.put(phoneNumber, surname);
        }
    }

    public void get(String surname) {
        if (!phonebookMap.containsValue(surname)) {
            System.out.println((surname + " phone number not found"));
        } else {
            for (Map.Entry<String, String> element : phonebookMap.entrySet()) {
                if (element.getValue().equals(surname)) {
                    System.out.println(surname + " phone number: " + element.getKey().replaceAll("(\\d{3})(\\d{2})(\\d{3})(\\d{2})(\\d{2})", "+$1 ($2) $3 $4 $5"));
                }
            }
        }
    }
}
