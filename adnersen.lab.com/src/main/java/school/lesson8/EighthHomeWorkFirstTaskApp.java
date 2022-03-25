package school.lesson8;

import java.util.*;

public class EighthHomeWorkFirstTaskApp {
    public static void main(String[] args) {
// Для удобства количество слов соответствует названию
        List<String> words = new ArrayList<>(Arrays.asList("one", "two", "two", "three", "three", "three", "four", "four", "four", "four", "five", "five", "five", "five", "five"));

        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);

        for (String word : uniqueWords) {
            System.out.println(word + " - " + Collections.frequency(words, word));
        }

// Можно сделать через итератор, но через for запись локаничнее
//        Iterator<String> uniqueWordsIterator = uniqueWords.iterator();
//        String word;
//        while (uniqueWordsIterator.hasNext()) {
//            word = uniqueWordsIterator.next();
//            System.out.println(word + " - " + Collections.frequency(words, word));
//        }
    }
}
