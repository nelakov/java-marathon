package day11.task1;

public class Warehouse {
    
    private int countPickedOrders;
    
    private int countDeliveredOrders;
    
    public int getCountPickedOrders() {
        return countPickedOrders;
    }
    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }
    
    public void setCountPickedOrders(int countPickedOrders) {
        this.countPickedOrders = countPickedOrders;
    }
    public void setCountDeliveredOrders(int countDeliveredOrders) {
        this.countDeliveredOrders = countDeliveredOrders;
    }

    @Override
    public String toString() {
        return "Warehouse Report:" + "\n" +
                "---> Count Picked Orders = " + countPickedOrders + "\n" +
                "---> Count Delivered Orders = " + countDeliveredOrders;
    }
    
}
