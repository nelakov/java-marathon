package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello user. Please input divisible and divisor");
            System.out.println();
            System.out.println("Your divisible");
            double dividend = scanner.nextDouble();
            System.out.println("Your divisor");
            double divisor = scanner.nextDouble();

            if(divisor == 0) {
                System.out.println("Cannot divide by zero. Please enter a non-zero divisor.");
                continue;
            }

            double quotient = dividend / divisor;
            System.out.println(quotient);
        }
    }
}
