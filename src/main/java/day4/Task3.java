package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrix = new int [12][8];
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = random.nextInt(50);
            }
        }

        int maxSumString = 0;
        int maxIndex = 0;
        for (int i = 0; i < matrix.length; i++) {
            int sumString = 0;
            for (int j = 0; j < matrix.length; j++) {
                sumString += matrix[i][j];
            }

            if (sumString >= maxSumString){
                maxSumString = sumString;
                maxIndex = i;
            }
        }
        System.out.println(maxIndex);
    }
}