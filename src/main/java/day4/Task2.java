package day4;

import java.util.Arrays;
import java.util.Random;

import javax.lang.model.element.Element;

public class Task2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int [] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        for (int x : array) {
            if(x < min) {
                min = x;
            }

            if(x > max) {
                max = x;
            }
        }
        System.out.println(min);
        System.out.println(max);

        int counter = 0;
        int sumOfValue = 0;
        for (int value : array) {
            if(value % 10 == 0) {
                counter++;
                sumOfValue += value ;
            }
        }
        System.out.println(counter);
        System.out.println(sumOfValue);
    }
    
}