package company.task2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PolyndromeService {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Anna", "duck", "string", "Civic", "Kayak", "level", "cat", "dog");
        reverseWordsInString(words);
    }

    public static void reverseWordsInString(List<String> words) {
        Map<Boolean, List<String>> map = words.stream()
                .collect(Collectors.partitioningBy(s -> reverseWord(s.toLowerCase())));

        System.out.println("polyndroms " + map.get(true));
        System.out.println("not polyndroms " + map.get(false));
    }

    private static boolean reverseWord(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
