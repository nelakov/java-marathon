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

    public static void evenNumber(int a, int b, List<Integer> list) {
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                list.add(a);
            }
            a++;
        }
    }
}
