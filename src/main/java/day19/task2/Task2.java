package day19.task2;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.out;

public class Task2 {
    private static Scanner scanner = new Scanner(System.in);
    private static File file = new File("C:\\Users\\nelak\\Repositories\\IdeaProjects\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\taxi_cars.txt");
    private static Map<Integer, Point> taxiCars = new HashMap();
    private static Map<Point, Point> square = new HashMap();
    private static int x1;
    private static int y1;
    private static int x2;
    private static int y2;

    public static Map<Integer, Point> parseFileToMap(File file, Map<Integer, Point> taxiCars) {
        try (Scanner scanner = new Scanner(file)) {
            scanner.useDelimiter(" ");

            while (scanner.hasNextLine()) {
                int idTaxi = 0;
                int x = 0;
                int y = 0;
                String line = scanner.nextLine();
                String[] values = line.split(" ");

                if (values.length != 3)
                    throw new IOException();

                for (int i = 0; i < 3; i++) {
                    if (i == 0)
                        idTaxi = Integer.parseInt(values[i]);
                    if (i == 1)
                        x = Integer.parseInt(values[i]);
                    if (i == 2)
                        y = Integer.parseInt(values[i]);
                }

                taxiCars.put(idTaxi, new Point(x, y));
            }

        } catch (IOException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
            if (e instanceof IOException) {
                out.println(e + " ---> File not found or Invalid input file");
            } else if (e instanceof NumberFormatException) {
                out.println(e + " ---> Can't parse this symbols");
            } else if (e instanceof ArrayIndexOutOfBoundsException) {
                out.println(e + " ---> You try get non exist element from array");
            }
        }
        return taxiCars;
    }

    public static void isCarInTheSquare(Map<Integer, Point> a) {
        Point carPoints;
        int carX;
        int carY;
        int count = 0;
        out.println("_-_-_-_-_-_-_-_- Car ID's into square_-_-_-_-_-_-_-_-");
        for (Map.Entry<Integer, Point> cars : a.entrySet()) {
            carPoints = cars.getValue();
            carX = carPoints.getX();
            carY = carPoints.getY();
            if ((carX < x1 && carX > x2) || (carY > y1 && carY < y2)) {
                out.println("ID: " + "[" + cars.getKey() + "]");
            }
            count++;
        }
        out.println("Total count cars: " + count);
    }

    public static void main(String[] args) {
        taxiCars = parseFileToMap(file, taxiCars);
        out.println("-_-_-_-_-_- Please input coordinates for square -_-_-_-_-_-");
//        try {
//            if (!(scanner.nextInt() <= 0) || !(scanner.nextInt() > 99))
//                x1 = scanner.nextInt();
//            else if (!(scanner.nextInt() <= 0) || !(scanner.nextInt() > 99))
//                y1 = scanner.nextInt();
//            else if (!(scanner.nextInt() <= 0) || !(scanner.nextInt() > 99))
//                x2 = scanner.nextInt();
//            else if (!(scanner.nextInt() <= 0) || !(scanner.nextInt() > 99))
//                y2 = scanner.nextInt();
//            else throw new RuntimeException();

//        } catch (IllegalArgumentException e) {
//            throw new RuntimeException(e + "Input invalid value");
//        }
        System.out.println("First point x1,y1:");
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        System.out.println("Second point x1,y1:");
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();
        isCarInTheSquare(taxiCars);
    }
}

