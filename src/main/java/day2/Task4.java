package day2;

import java.util.Scanner;

public class Task4 {
    private static final double DEFAULT_RESULT = 420;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y;
        if (x >= 5) {
            y = (Math.pow(x, 2) - 10) / (x + 7);
        } else if (x > 3 && x < 5) {
            y = (x + 3) * (Math.pow(x, 2) - 2);
        } else {
            y = DEFAULT_RESULT;
        }
        System.out.println(y);
    }
}
