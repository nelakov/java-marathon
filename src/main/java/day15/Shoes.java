package day15;

public class Shoes {
    private String name;
    private int size;
    private int count;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", count=" + count +
                '}';
    }
}
