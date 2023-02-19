package day16;

import java.io.FileNotFoundException;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        Task2Methods methods = new Task2Methods();

        methods
                .writeRandomNumberToFile()
                .readAndСalculateArithmeticMean()
                .readSumAndPrintFromFile();
    }
}
