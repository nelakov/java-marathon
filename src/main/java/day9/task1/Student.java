package day9.task1;

public class Student extends Human {
    private String groupName;

    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("This is a student named " + getName());
    }

}
