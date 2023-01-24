package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int [] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        int maxSumTrinity = 0;
        int index = 0;
        for (int i = 0; i < array.length - 2; i++) {
            int sumTrinity = 0;
            for (int j = i; j < i+3; j++) {
                sumTrinity += array[j];
            }

            if(sumTrinity > maxSumTrinity) {
                maxSumTrinity = sumTrinity;
                index = i;
            }
        }
        
        System.out.println(maxSumTrinity);
        System.out.println(index);
    }
    
}
