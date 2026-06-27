package day19.task2;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.out;

public class Task2 {
    private static Scanner scanner = new Scanner(System.in);
    private static File file = new File("src/main/resources/taxi_cars.txt");
    private static Map<Integer, Point> taxiCars = new HashMap<>();
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

                idTaxi = Integer.parseInt(values[0]);
                x = Integer.parseInt(values[1]);
                y = Integer.parseInt(values[2]);
                taxiCars.put(idTaxi, new Point(x, y));
            }
        } catch (IOException e) {
            throw new RuntimeException("File not found or invalid input file", e);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Can't parse these symbols", e);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException("Tried to get a non-existent element from array", e);
        }
        return taxiCars;
    }

    public static void isCarInTheSquare(Map<Integer, Point> a) {
        Point carPoints;
        int carX;
        int carY;
        int count = 0;
        int minX = Math.min(x1, x2);
        int maxX = Math.max(x1, x2);
        int minY = Math.min(y1, y2);
        int maxY = Math.max(y1, y2);
        out.println("_-_-_-_-_-_-_-_- Car ID's into square_-_-_-_-_-_-_-_-");
        for (Map.Entry<Integer, Point> cars : a.entrySet()) {
            carPoints = cars.getValue();
            carX = carPoints.getX();
            carY = carPoints.getY();
            if (carX >= minX && carX <= maxX && carY >= minY && carY <= maxY) {
                out.println("ID: " + "[" + cars.getKey() + "]");
            }
            count++;
        }
        out.println("Total count cars: " + count);
    }

    public static void main(String[] args) {
        taxiCars = parseFileToMap(file, taxiCars);
        out.println("-_-_-_-_-_- Please input coordinates for square -_-_-_-_-_-");
        System.out.println("First point x1,y1:");
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        System.out.println("Second point x2,y2:");
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();
        isCarInTheSquare(taxiCars);
    }
}

