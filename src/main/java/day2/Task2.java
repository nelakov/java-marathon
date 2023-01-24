package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input numbers of diapasone");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        divideWithoutReminder(a, b);
    }

    public static void divideWithoutReminder(int a, int b) {
        if(a >= b){
            System.out.println("Incorrect input");
        }
        for (int i = a + 1; i < b; i++) {
            if(i % 5 == 0 && i % 10 > 0) {
                System.out.print(i + " ");
            }
        }
    }
}
