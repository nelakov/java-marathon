package day18;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println(sumArray(numbers, 0));
    }

    public static int sumArray(int[] numbers, int index) {
        if (index == numbers.length)
            return 0;

        return numbers[index] + sumArray(numbers, index + 1);
    }
}
