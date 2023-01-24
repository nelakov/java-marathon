package day9.task2;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double area() {
        double s = Math.PI * (radius * radius);
        return s;
    }

    @Override
    public double perimeter() {
        double p = 2*Math.PI*radius;
        return p;
    }
    
}
