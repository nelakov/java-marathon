package day11.task1;

public class Courier implements Worker {

    private int salary;
    private boolean isPaid;
    private final Warehouse warehouse;
    private boolean bonusPaid = false;
    private int counterDelivery = 0;

    public Courier(int salary, boolean isPaid, Warehouse warehouse) {
        this.salary = salary;
        this.isPaid = isPaid;
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPaid() {
        return isPaid;
    }

    @Override
    public String toString() {
        return "Courier " + "\n" +
                "---> Salary = " + salary + "\n" +
                "---> BONUS is paid? = " + isPaid;
    }

    @Override
    public void doWork() {
        salary = salary + 100;
        ++counterDelivery;
        warehouse.setCountDeliveredOrders(counterDelivery);
    }

    @Override
    public void bonus() {
        if (bonusPaid) {
            System.out.println("Bonus was paid already");
        } else {
            if (warehouse.getCountDeliveredOrders() < TARGET_COUNT_ORDERS) {
                System.out.println("Bonus unavailable");
            }

            if (warehouse.getCountDeliveredOrders() == TARGET_COUNT_ORDERS) {
                salary += 70_000;
                isPaid = true;
                bonusPaid = true;
            }
        }
    }

}
