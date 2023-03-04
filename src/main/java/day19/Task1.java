package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Task1 {

    public static Map<String, Integer> parseFileToSet(File file, Map<String, Integer> setWords) {
        try (Scanner scanner = new Scanner(file)) {
            scanner.useDelimiter("[.,:;()?!\"\\s–]+");

            while (scanner.hasNext()) {
                String word = scanner.next();
                Integer wordCounter = setWords.get(word);

                if (wordCounter != null)
                    wordCounter++;
                else
                    wordCounter = 1;

                setWords.put(word, wordCounter);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Invalid input file: " + e.getMessage());
        }
        return setWords;
    }

    public static List<Map.Entry<String, Integer>> getTheMostUsedWord(Map<String, Integer> setWords) {
        List<Map.Entry<String, Integer>> mapList = new ArrayList<>(setWords.entrySet());
        Map<String, Integer> mapResult = null;
        Collections.sort(mapList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if (o1.getValue() > o2.getValue())
                    return -1;
                else if (o1.getValue() < o2.getValue())
                    return 1;
                else return 0;
            }
        });

        //TODO: Another solving
//        int max = 0;
//
//        for (Map.Entry<String, Integer> word : setWords.entrySet()) {
//            if (word.getValue() > max)
//                max = word.getValue();
//        }
//        return max;
//    }
        return mapList;
    }


    public static void printOneHundredMostСommonWords(List<Map.Entry<String, Integer>> setWords) {
        for (Map.Entry<String, Integer> e : setWords) {
            System.out.println(e.getKey() + " - " + e.getValue());
        }
//        TODO: Another solving
//        setWords.entrySet().stream()
//                .sorted(Map.Entry.comparingByValue((a, b) -> b - a)).limit(100)
//                .forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));
    }

    public static void main(String[] args) {
        File file = new File("C:\\Users\\nelak\\Repositories\\IdeaProjects\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\dushi.txt");
        Map<String, Integer> setWords = new HashMap();
        printOneHundredMostСommonWords(getTheMostUsedWord(parseFileToSet(file, setWords)));
    }
}
