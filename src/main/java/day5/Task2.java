package day5;

public class Task2 {
    public static void main(String[] args) {
        int releaseYear = 1995;
        String model = "Honda";
        String color = "Yellow";

        Motorbike motorbike = new Motorbike(model, color, releaseYear);

        System.out.println("Bike: " + motorbike.getModel() + "\n" + "Color: " + motorbike.getColor() + "\n" + "Release: " + motorbike.getYear());
    }
}
