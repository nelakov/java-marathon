package day16;

import java.io.FileNotFoundException;

public class Task2 {
    public static void main(String[] args) {
        Task2Methods methods = new Task2Methods();

        try {
            methods
                    .writeRandomNumberToFile()
                    .readAndСalculateArithmeticMean()
                    .readSumAndPrintFromFile();
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File was not found");
        }
    }
}
