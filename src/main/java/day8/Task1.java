package day8;

public class Task1 {
    public static void main(String[] args) {
        runGlueStringWithStringBuilder();
        runGlueStringWithConcatenation();
    }

    static void runGlueStringWithStringBuilder() {
        StringBuilder string = new StringBuilder(" ");
        long startTime = System.currentTimeMillis();
        for (Integer i = 0; i <= 20000; i++) {
            string = string.append(i);
        }

        System.out.println(string);
        long stopTime = System.currentTimeMillis();
        System.out.println("\n Длительность работы, в мс.: " + (stopTime - startTime));
    }

    static void runGlueStringWithConcatenation() {
        String string = "";
        long startTime = System.currentTimeMillis();
        for (Integer i = 0; i <= 20000; i++) {
            string = i + " ";
        }
        System.out.print(string);
        long stopTime = System.currentTimeMillis();
        System.out.println("\n Длительность работы, в мс.: " + (stopTime - startTime));
    }

}
