package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("Red");
        car.setModel("Toyota Mark II");
        car.setYear(1992);

        System.out.println(
                "Car: " + car.getModel() + "\n" + "Color: " + car.getColor() + "\n" + "Realise: " + car.getYear());
    }
}