package day9.task2;

public class Triangle extends Figure {
    private int length1;
    private int length2;
    private int length3;
    
    public Triangle(int length1, int length2, int length3, String color) {
        super(color);
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
    }

    @Override
    public double area() {
        double s = 0.5 * (length1 * length2);
        return s;
    }

    @Override
    public double perimeter() {
        double p = length1 + length2 + length3;
        return p;
    }

}
