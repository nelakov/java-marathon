package day14.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("files/people");
        try {
            List<String> stringList = parseFileToStringList(file);
            System.out.println(stringList);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Invalid input file");
        }

    }

    public static List<String> parseFileToStringList(File file) throws IOException {
        Scanner scanner = new Scanner(file);
        List<String> stringList = new ArrayList<>();
        String line;
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            stringList.add(line);
            String[] arr = line.split(" ");
            if (Integer.parseInt(arr[1]) < 0) {
                throw new IOException();
            }
        }

        return stringList;
    }
}
