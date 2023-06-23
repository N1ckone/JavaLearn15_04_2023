package homeWork7;


import java.util.HashMap;
import java.util.Map;

//# 4
public class WordsFinder {
    public static void main(String[] args) {
        String[] strings = {"Никита", "Соня", "Саша", "Максим", "Гоша", "Иван", "Саша", "Соня"};
        findAndPrintUniqueWords(strings);
    }

    public static void findAndPrintUniqueWords(String[] arr) {
        Map<String, Integer> words = new HashMap<>();
        for (String s : arr) {
            if (words.containsKey(s)) {
                words.put(s, words.get(s) + 1);
            } else {
                words.put(s, 1);
            }
        }
        System.out.println("Список уникальных слов:");
        for (String s : arr) {
            if (words.get(s) == 1) {
                System.out.println(s);
            }
        }
        System.out.println("Список всех слов и их количества");
        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            System.out.println(entry.getKey() + "(количество - " + entry.getValue() + ")");
        }
    }
}
