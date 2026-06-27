package day1;

import java.util.Scanner;

public class Task5 {
    private static final int FIRST_OLYMPIC_YEAR = 1980;
    private static final int LAST_OLYMPIC_YEAR = 2020;
    private static final int OLYMPIC_INTERVAL_YEARS = 4;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input Olympic games year: ");
            int year = scanner.nextInt();
            printQualifyingYears(year);
        }
    }

    public static void printQualifyingYears(int yearOlympicGames) {
        if (yearOlympicGames < FIRST_OLYMPIC_YEAR || yearOlympicGames > LAST_OLYMPIC_YEAR) {
            System.out.println("Invalid year: enter a year between " + FIRST_OLYMPIC_YEAR + " and " + LAST_OLYMPIC_YEAR);
        } else {
            for (; yearOlympicGames <= LAST_OLYMPIC_YEAR; yearOlympicGames = yearOlympicGames + OLYMPIC_INTERVAL_YEARS) {
                System.out.printf("The Olympic games %d year \n", yearOlympicGames);
            }
        }
    }
}
