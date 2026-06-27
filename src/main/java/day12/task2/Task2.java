package day12.task2;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        evenNumber(0,30, num);
        evenNumber(300, 350, num);
        System.out.println(num);
    }

    public static void evenNumber(int from, int to, List<Integer> list) {
        for (int number = from; number <= to; number++) {
            if (number % 2 == 0) {
                list.add(number);
            }
        }
    }
}
