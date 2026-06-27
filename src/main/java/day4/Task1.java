package day4;

import java.util.Arrays;

public class Task1 {
    private static final int RANDOM_BOUND = 10;
    private static final int GREATER_THAN_THRESHOLD = 8;
    private static final int TARGET_VALUE = 1;

    public static void main(String[] args) {
        int[] array = new int[10];
        int countGreaterThanThreshold = 0;
        int countEqualToTarget = 0;
        int countEvenNumbers = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * RANDOM_BOUND);
        }

        for (int value : array) {
            if (value > GREATER_THAN_THRESHOLD) {
                countGreaterThanThreshold++;
            } else if (value == TARGET_VALUE) {
                countEqualToTarget++;
            }
            if (value % 2 == 0) {
                countEvenNumbers++;
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.printf("Array length: %d \n", array.length);
        System.out.printf("The number of numbers is greater then 8: %d \n", countGreaterThanThreshold);
        System.out.printf("The number of numbers is equal the one:  %d \n", countEqualToTarget);
        System.out.printf("The even numbers: %d \n", countEvenNumbers);
    }
}
