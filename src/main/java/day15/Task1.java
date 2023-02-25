package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.out;

public class Task1 {
    //Create two path
    static File FILE = new File("C:\\Users\\nelak\\Repositories\\IdeaProjects\\JavaMarathon2021\\JavaMarathon2021\\files\\shoes.csv");
    static File FILE_OUT = new File("C:\\Users\\nelak\\Repositories\\IdeaProjects\\JavaMarathon2021\\JavaMarathon2021\\files\\result.txt");

    //Mapping on the Shoes DTO
    public static List<Shoes> parseFileToObjList(File file) {
        List<Shoes> shoesList = new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                Shoes shoes = new Shoes();
                String[] arr = scanner.nextLine().split(";");

                if (arr.length != 3) {
                    throw new IOException();
                }
                if (Integer.parseInt(arr[2]) == 0) {
                    for (int i = 0; i < arr.length; i++) {
                        if (i == 0) {
                            shoes.setName(arr[i]);
                        }
                        if (i == 1) {
                            shoes.setSize(Integer.parseInt(arr[i]));
                        }
                        if (i == 2) {
                            shoes.setCount(Integer.parseInt(arr[i]));
                        }
                        shoesList.add(shoes);
                    }
                }
            }
        } catch (IOException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
            if (e instanceof IOException) {
                out.println("File not found or Invalid input file");
            } else if (e instanceof NumberFormatException) {
                out.println(e + "Can't parse this symbols");
            } else if (e instanceof ArrayIndexOutOfBoundsException) {
                out.println("You try get non exist element from array");
            }
        }
        assert scanner != null;
        scanner.close();
        return shoesList;
    }

    // Parsing from List and write to file
    public static void writeAbsenteesShoesToNewFile(List<Shoes> shoesList) {
        FILE_OUT.getParentFile().mkdirs();
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(FILE_OUT);
        } catch (FileNotFoundException e) {
            out.println("File for write wasn't create");
        }

        for (Shoes shoe : shoesList) {
            pw.println(shoe.getName() + ";" + shoe.getSize() + ";" + shoe.getCount() + ";");
        }
        pw.close();
    }

    public static void main(String[] args) {
        List<Shoes> stringList = parseFileToObjList(FILE);
        writeAbsenteesShoesToNewFile(stringList);

    }
}
