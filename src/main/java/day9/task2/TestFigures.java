package day9.task2;

import java.util.function.ToDoubleFunction;

public class TestFigures {
    private static final String COLOR_FILTER = "Red";

    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(10, 10, 10, COLOR_FILTER),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, COLOR_FILTER),
                new Rectangle(5, 10, COLOR_FILTER),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, COLOR_FILTER),
                new Circle(10, COLOR_FILTER),
                new Circle(5, "Blue")
        };

        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));
    }

    public static double calculateRedPerimeter(Figure[] figures) {
        return sumRedMetric(figures, Figure::perimeter);
    }

    public static double calculateRedArea(Figure[] figures) {
        return sumRedMetric(figures, Figure::area);
    }

    private static double sumRedMetric(Figure[] figures, ToDoubleFunction<Figure> metric) {
        double sum = 0;
        for (Figure figure : figures) {
            if (COLOR_FILTER.equals(figure.getColor())) {
                sum += metric.applyAsDouble(figure);
            }
        }
        return sum;
    }
}
