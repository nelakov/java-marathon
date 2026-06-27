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
    static File INPUT_FILE = new File("files/shoes.csv");
    static File OUTPUT_FILE = new File("files/result.txt");

    public static List<Shoes> parseFileToObjList(File file) {
        List<Shoes> shoesList = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                Shoes shoes = new Shoes();
                String[] arr = scanner.nextLine().split(";");

                if (arr.length != 3) {
                    throw new IOException();
                }
                if (Integer.parseInt(arr[2]) == 0) {
                    shoes.setName(arr[0]);
                    shoes.setSize(Integer.parseInt(arr[1]));
                    shoes.setCount(Integer.parseInt(arr[2]));
                    shoesList.add(shoes);
                }
            }
        } catch (IOException e) {
            out.println("File not found or Invalid input file");
        } catch (NumberFormatException e) {
            out.println(e + "Can't parse this symbols");
        } catch (ArrayIndexOutOfBoundsException e) {
            out.println("You try get non exist element from array");
        }
        return shoesList;
    }

    public static void writeAbsenteesShoesToNewFile(List<Shoes> shoesList) {
        OUTPUT_FILE.getParentFile().mkdirs();
        try (PrintWriter pw = new PrintWriter(OUTPUT_FILE)) {
            for (Shoes shoe : shoesList) {
                pw.println(shoe.getName() + ";" + shoe.getSize() + ";" + shoe.getCount() + ";");
            }
        } catch (FileNotFoundException e) {
            out.println("File for write wasn't create");
        }
    }

    public static void main(String[] args) {
        List<Shoes> absentShoes = parseFileToObjList(INPUT_FILE);
        writeAbsenteesShoesToNewFile(absentShoes);
    }
}
