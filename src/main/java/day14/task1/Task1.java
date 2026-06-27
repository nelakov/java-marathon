package day14.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("files/test");
        try {
            printSumOfNumbers(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Invalid input file");
        }

    }

    static void printSumOfNumbers(File file) throws IOException {
        try (Scanner scanner = new Scanner(file)) {
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");

            if (numbersString.length != 10) {
                throw new IOException();
            }

            int sumNumbers = 0;
            for (String number : numbersString) {
                sumNumbers += Integer.parseInt(number);
            }
            System.out.println(sumNumbers);
        }
    }


}
