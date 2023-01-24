package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Warehouse warehouse2 = new Warehouse();
        Picker picker = new Picker(0, false, warehouse);
        Picker picker2 = new Picker(0, false, warehouse);
        Courier courier = new Courier(0, false, warehouse);
        Courier courier2 = new Courier(0, false, warehouse);

        businessProcess(picker);
        businessProcess(courier);
        System.out.println(warehouse.toString());
        System.out.println(picker.toString());
        System.out.println(courier.toString());

        businessProcess(courier2);
        System.out.println(warehouse.toString());
        System.out.println(picker.toString());
        System.out.println(courier.toString());

    }

    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
