package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Hello user. Please input divisible and divisor");
            System.out.println();
            System.out.println("Your divisible");
            double a = scanner.nextDouble();
            System.out.println("Your divisor");
            double b = scanner.nextDouble();

            if(b == 0) {
                System.out.println("Ooops! Cannot be divided by zero! Go to school loser");
                continue;
            } 

            double c = a / b;
            System.out.println(c);
        }
    }
}
