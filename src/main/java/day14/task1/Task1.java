package day14.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("files/test");
        try {
            printSumDigits(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Invalid input file");
        }

    }

    static void printSumDigits(File file) throws IOException {
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");
        int sumNumbers = 0;
        int counter = 0;

        for (String ignored : numbersString) {
            counter++;
        }

        for (String number : numbersString) {
            if (counter != 10) {
                throw new IOException();
            }
            sumNumbers += Integer.parseInt(number);
        }
        System.out.println(sumNumbers);

        scanner.close();
    }


}

