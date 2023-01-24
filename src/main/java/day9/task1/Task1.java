package day9.task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Nail", "Java Marathon");
        Teacher teacher = new Teacher("Sergey", "Java");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());
        student.printInfo();
        teacher.printInfo();
    }
}
