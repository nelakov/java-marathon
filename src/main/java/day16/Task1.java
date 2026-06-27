package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("files/test");

        try (Scanner scanner = new Scanner(file)) {
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");

            int sum = 0;
            for (String number : numbers) {
                sum += Integer.parseInt(number);
            }

            double result = sum / (double) numbers.length;

            System.out.printf("--> %.3f%n", result);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }
}

