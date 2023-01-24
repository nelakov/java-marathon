package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();

        switch(country) {
            case "Moscow" : 
            case "Rostov" : 
            case "Vladivostok" : 
            System.out.println("Russia");
            break;

            case "Rome" : 
            case "Milan" : 
            System.out.println("Italy");
            break;

            case "Liverpool" : 
            case "Manchester" : 
            case "London" : 
            System.out.println("England");
            break;

            case "Berlin" : 
            case "Munhen" : 
            case "Keln" : 
            System.out.println("Germany");
            break;

            case "Stop" :
            break;

            default : 
            System.out.println("Unknown country");
            break;
        }
    }
} 