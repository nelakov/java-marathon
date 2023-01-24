package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countFloor = scanner.nextInt();

        if (countFloor < 0) {
            System.out.println("Incorrect input");
        } else if (countFloor >= 1 && countFloor <= 4) {
            System.out.println("Low-rise house");
        } else if (countFloor >= 1 && countFloor <= 4) {
            System.out.println("Medium-rise house");
        } else if (countFloor >= 1 && countFloor <= 4) {
            System.out.println("Мultistory house");
        }
    }
}