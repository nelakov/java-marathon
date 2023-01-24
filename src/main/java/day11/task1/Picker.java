package day11.task1;

public class Picker implements Worker {
    
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;
    private int counterBonus = 0;
    private int counterWork = 0;
    private static final int TARGET_COUNT_ORDERS = 10000;

    public Picker(int salary, boolean isPayed, Warehouse warehouse) {
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
    
    public Picker(int salary, boolean isPayed) {
        this.salary = salary;
        this.isPayed = isPayed;
    }
    
    @Override
    public String toString() {
        return "Picker " + "\n" +
                "---> Salary = " + salary + "\n" + 
                "---> BONUS is payed? = " + isPayed;
    }

    @Override
    public void doWork() {
        salary = salary + 80;
        ++counterWork;
        warehouse.setCountPickedOrders(counterWork);
    }

    @Override
    public void bonus() {
        
        if(counterBonus >= 1) {
            System.out.println("Bonus was payed alredy");
        } else {
            if(warehouse.getCountPickedOrders() < TARGET_COUNT_ORDERS) {
                System.out.println("Bonus unavailable");
            }
    
            if(warehouse.getCountPickedOrders() == TARGET_COUNT_ORDERS) {
                salary += 70.000;
                isPayed = true;
                counterBonus++;
            }
        }
    }

}
