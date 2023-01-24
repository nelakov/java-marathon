package day9.task1;

public class Student extends Human{
    String groupName;

    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public void printInfo() {
        System.out.println("Этот человек с именем " + getName());
        System.out.println("Этот cтудент с именем " + getName());
    }

}
