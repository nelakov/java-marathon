package day11.task1;

public class Courier implements Worker {
    
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;
    private int counterBonus = 0;
    private int counterDelivery = 0;
    private static final int TARGET_COUNT_ORDERS = 10000;
    
    public Courier(int salary, boolean isPayed, Warehouse warehouse) {
        this.salary = salary;
        this.isPayed = isPayed;
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }
    public boolean isPayed() {
        return isPayed;
    }
    
    public Courier(int salary, boolean isPayed) {
        this.salary = salary;
        this.isPayed = isPayed;
    }
    
    @Override
    public String toString() {
        return "Courier " + "\n" +
                "---> Salary = " + salary + "\n" + 
                "---> BONUS is payed? = " + isPayed;
    }

    @Override
    public void doWork() {
        salary = salary + 100;
        ++counterDelivery;
        warehouse.setCountDeliveredOrders(counterDelivery);  
    }

    @Override
    public void bonus() {
        if(counterBonus >= 1) {
            System.out.println("Bonus was payed alredy");
        } else {
            if(warehouse.getCountDeliveredOrders() < TARGET_COUNT_ORDERS) {
                System.out.println("Bonus unavailable");
            }
    
            if(warehouse.getCountDeliveredOrders() == TARGET_COUNT_ORDERS) {
                salary += 70000;
                isPayed = true;
                counterBonus++;
            }
        }
    }

}
