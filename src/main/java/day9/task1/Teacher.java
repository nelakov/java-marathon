package day9.task1;

public class Teacher extends Human {
    private String subjectName;

    public Teacher(String name, String subjectName) {
        super(name);
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    @Override
    public void printInfo() {
        System.out.println("Этот человек с именем " + getName());
        System.out.println("Этот преподаватель с именем " + getName());
    }
    
}
