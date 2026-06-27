package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Task1 {

    public static Map<String, Integer> countWordFrequencies(File file, Map<String, Integer> wordCounts) {
        try (Scanner scanner = new Scanner(file)) {
            scanner.useDelimiter("[.,:;()?!\"\\s–]+");

            while (scanner.hasNext()) {
                String word = scanner.next();
                Integer wordCounter = wordCounts.get(word);

                if (wordCounter != null)
                    wordCounter++;
                else
                    wordCounter = 1;

                wordCounts.put(word, wordCounter);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Invalid input file: " + e.getMessage());
        }
        return wordCounts;
    }

    public static List<Map.Entry<String, Integer>> sortWordsByFrequency(Map<String, Integer> wordCounts) {
        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCounts.entrySet());
        sortedWords.sort(Comparator.comparingInt(Map.Entry<String, Integer>::getValue).reversed());
        return sortedWords;
    }

    public static void printWordsByFrequency(List<Map.Entry<String, Integer>> sortedWords) {
        for (Map.Entry<String, Integer> e : sortedWords) {
            System.out.println(e.getKey() + " - " + e.getValue());
        }
    }

    public static void main(String[] args) {
        File file = new File("src/main/resources/dushi.txt");
        Map<String, Integer> wordCounts = new HashMap<>();
        printWordsByFrequency(sortWordsByFrequency(countWordFrequencies(file, wordCounts)));
    }
}
