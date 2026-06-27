package day1;

import java.util.Scanner;

public class Task6 {
    private static final int MULTIPLICATION_TABLE_SIZE = 10;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a number: ");
            int multiplier = scanner.nextInt();

            for (int i = 1; i < MULTIPLICATION_TABLE_SIZE; i++) {
                int total = i * multiplier;
                System.out.printf("%d x %d = %d \n", i, multiplier, total);
            }
        }
    }
}
