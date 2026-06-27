package day14.task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static List<Person> parseFileToObjList(File file) throws IOException {
        List<Person> people = new ArrayList<>();

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] arr = line.split(" ");
                if (Integer.parseInt(arr[1]) < 0) {
                    throw new IOException("Invalid input file: age must not be negative");
                }
                String name = arr[0];
                int age = Integer.parseInt(arr[1]);
                people.add(new Person(name, age));
            }
        }
        return people;
    }

    public static void main(String[] args) {
        File file = new File("files/people");
        try {
            List<Person> people = parseFileToObjList(file);
            System.out.println(people);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Invalid input file");
        }

    }


}
