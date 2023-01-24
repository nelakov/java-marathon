package day7;

public class Plane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Plane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getLength() {
        return length;
    }

    public int getFuel() {
        return fuel;
    }

    public void info() {
        System.out.println("Manufacturer: " + "manufacturer" + "\n" +
             "Year realise: " + year + "\n" + 
             "Length: " + length + "\n" + "Weight: " + weight + "\n" + 
             "Count of fuel: " + fuel
        );
    }

    public int fillUp(int n) {
        return fuel += n;
    } 

    public static void compareAirplanes(Plane plane1, Plane plane2) {
        System.out.println("Who has longer ???");
        if(plane1.getLength() > plane2.getLength()) {
            System.out.println("Airplane 1 has longer");
        } else if (plane1.getLength() < plane2.getLength()){
            System.out.println("Airplane 2 has longer");
        } else {
            System.out.println("Length of airplanes equals");
        }
    }
    
}
