package day4;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int [] array = new int[10];
        int sizeArray = array.length;
        int counterTheEightNumber = 0;
        int counterTheOneNumber = 0;
        int counterTheEvenNUmbers = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*10);
        }

        for (double d : array) {
            if(d > 8) {
                counterTheEightNumber++;
            } else if(d == 1) {
                counterTheOneNumber++;
            }
            if(d % 2 == 0){
                counterTheEvenNUmbers++;
            }

        }

        System.out.println(Arrays.toString(array));
        System.out.printf("Array length: %d \n", sizeArray);
        System.out.printf("The number of numbers is greater then 8: %d \n", counterTheEightNumber);
        System.out.printf("The number of numbers is equal the one:  %d \n", counterTheOneNumber);
        System.out.printf("The even numbers: %d \n", counterTheEvenNUmbers);

    }
}