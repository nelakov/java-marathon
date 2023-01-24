package day1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        for (int i = 1; i < 10; i++) {
            int total = i * k;
            System.out.printf("%d x %d = %d \n",i,k,total);
        }
    }
}
