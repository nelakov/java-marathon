package day6;

public class Task2 {
    public static void main(String[] args) {
        Plane plane = new Plane("Boeing", 1991, 1000, 20000);
        plane.setYear(2000);
        plane.setLength(1500);
        plane.fillUp(100);
        plane.fillUp(200);
        plane.info();
    }
    
}
