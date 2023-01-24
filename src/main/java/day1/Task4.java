package day1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Olimpic games year");
        int year = scanner.nextInt();
        olympicGamesCounter(year);
    }

    public static void olympicGamesCounter(int yearOlympicGames) {
        if (yearOlympicGames < 1980 || yearOlympicGames > 2020) {
            System.out.println("Exception! Unknown year");
        } else {
            while (yearOlympicGames <= 2020) {
                System.out.printf("The Olympic games %d year \n", yearOlympicGames);
                yearOlympicGames = yearOlympicGames + 4;
            }
        }
    }
}
