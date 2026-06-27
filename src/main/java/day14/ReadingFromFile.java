package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) {
        File file = new File("test");

        try (Scanner scanner = new Scanner(file)) {
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            int[] numbers = new int[numbersString.length];
            int counter = 0;

            for (String number : numbersString) {
                numbers[counter++] = Integer.parseInt(number);
            }

            System.out.println(Arrays.toString(numbers));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
