package day9.task2;

public class Rectangle extends Figure {
    private int width;
    private int height;
    
    public Rectangle(int width, int height, String color    ) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        double s = width * height;
        return s;
    }

    @Override
    public double perimeter() {
        double p = 2 * (width + height);
        return p;
    }

    
}
