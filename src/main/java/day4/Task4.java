package day4;

import java.util.Random;

public class Task4 {
    private static final int TRIPLE_SIZE = 3;

    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        int maxConsecutiveTripleSum = 0;
        int index = 0;
        for (int i = 0; i < array.length - 2; i++) {
            int consecutiveTripleSum = 0;
            for (int j = i; j < i + TRIPLE_SIZE; j++) {
                consecutiveTripleSum += array[j];
            }

            if (consecutiveTripleSum > maxConsecutiveTripleSum) {
                maxConsecutiveTripleSum = consecutiveTripleSum;
                index = i;
            }
        }

        System.out.println(maxConsecutiveTripleSum);
        System.out.println(index);
    }
}
