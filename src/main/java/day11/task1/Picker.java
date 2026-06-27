package day11.task1;

public class Picker implements Worker {

    private int salary;
    private boolean isPaid;
    private final Warehouse warehouse;
    private boolean bonusPaid = false;
    private int counterWork = 0;

    public Picker(int salary, boolean isPaid, Warehouse warehouse) {
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
        return "Picker " + "\n" +
                "---> Salary = " + salary + "\n" +
                "---> BONUS is paid? = " + isPaid;
    }

    @Override
    public void doWork() {
        salary = salary + 80;
        ++counterWork;
        warehouse.setCountPickedOrders(counterWork);
    }

    @Override
    public void bonus() {
        if (bonusPaid) {
            System.out.println("Bonus was paid already");
        } else {
            if (warehouse.getCountPickedOrders() < TARGET_COUNT_ORDERS) {
                System.out.println("Bonus unavailable");
            }

            if (warehouse.getCountPickedOrders() == TARGET_COUNT_ORDERS) {
                salary += 70_000;
                isPaid = true;
                bonusPaid = true;
            }
        }
    }

}
