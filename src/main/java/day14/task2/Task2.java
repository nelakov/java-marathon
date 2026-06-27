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
            System.out.println(e.getMessage());
        }

    }

    public static List<String> parseFileToStringList(File file) throws IOException {
        List<String> stringList = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] arr = line.split(" ");
                if (arr.length < 2) {
                    continue;
                }
                stringList.add(line);
                if (Integer.parseInt(arr[1]) < 0) {
                    throw new IOException("Invalid input file");
                }
            }
        }

        return stringList;
    }
}
