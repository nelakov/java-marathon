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
        double s = (length1 + length2 + length3) / 2.0;
        return Math.sqrt(s * (s - length1) * (s - length2) * (s - length3));
    }

    @Override
    public double perimeter() {
        return length1 + length2 + length3;
    }

}
