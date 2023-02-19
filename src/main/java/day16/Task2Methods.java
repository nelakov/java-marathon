package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2Methods {
    private static File file1 = new File("C:\\Users\\nelak\\Repositories\\IdeaProjects\\JavaMarathon2021\\JavaMarathon2021\\files\\file1");
    private static File file2 = new File("C:\\Users\\nelak\\Repositories\\IdeaProjects\\JavaMarathon2021\\JavaMarathon2021\\files\\file2");
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

    public Task2Methods writeRandomNumberToFile() {
        for (int i = 0; i < 1000; i++) {
            pw1.println(random.nextInt(100));
        }
        pw1.close();
        return this;
    }


    public Task2Methods readAndСalculateArithmeticMean() throws FileNotFoundException {
        Scanner scanner = new Scanner(file1);

        int counter = 0;
        int sum = 0;
        while (scanner.hasNextLine()) {
            sum += Integer.parseInt(scanner.nextLine());
            counter++;

            if (counter == 20) {
                pw2.println(sum / 20.0);

                counter = 0;
                sum = 0;
            }
        }
        pw2.close();
        return this;
    }


    public Task2Methods readSumAndPrintFromFile() throws FileNotFoundException {
        Scanner scanner2 = new Scanner(file2);

        double result = 0;
        while (scanner2.hasNextLine()) {
            result += Double.parseDouble(scanner2.nextLine());
        }
        System.out.println((int) result);
        return this;
    }
}