package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2Methods {
    private static final int NUMBERS_COUNT = 1000;
    private static final int BATCH_SIZE = 20;

    private static File file1 = new File("files/file1");
    private static File file2 = new File("files/file2");
    private static Random random = new Random();
    private static PrintWriter pw1;

    static {
        try {
            pw1 = new PrintWriter(file1);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static PrintWriter pw2;

    static {
        try {
            pw2 = new PrintWriter(file2);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Task2Methods writeRandomNumbersToFile() {
        for (int i = 0; i < NUMBERS_COUNT; i++) {
            pw1.println(random.nextInt(100));
        }
        pw1.close();
        return this;
    }


    public Task2Methods readAndCalculateArithmeticMean() throws FileNotFoundException {
        try (Scanner scanner = new Scanner(file1)) {
            int counter = 0;
            int sum = 0;
            while (scanner.hasNextLine()) {
                sum += Integer.parseInt(scanner.nextLine());
                counter++;

                if (counter == BATCH_SIZE) {
                    pw2.println(sum / (double) BATCH_SIZE);

                    counter = 0;
                    sum = 0;
                }
            }
        }
        pw2.close();
        return this;
    }

    public Task2Methods readSumAndPrintFromFile() throws FileNotFoundException {
        double result = 0;
        try (Scanner scanner = new Scanner(file2)) {
            while (scanner.hasNextLine()) {
                result += Double.parseDouble(scanner.nextLine());
            }
        }
        System.out.println((int) result);
        return this;
    }
}