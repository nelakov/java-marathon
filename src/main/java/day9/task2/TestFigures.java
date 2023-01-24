package day9.task2;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };

        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));
    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double sumPerimeters = 0;
        for (Figure figure : figures) {
            if("Red".equals(figure.getColor())) {
                sumPerimeters += figure.perimeter();
            }
        }
        return sumPerimeters;
    }


    public static double calculateRedArea(Figure[] figures) {
        double sumArea = 0;
        for (Figure figure : figures) {
            if("Red".equals(figure.getColor())) {
                sumArea += figure.area();
            }
        }
        return sumArea;
    }
}
