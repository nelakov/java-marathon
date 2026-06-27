package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Klara Zaharovna", "Geography");
        Student student = new Student("Nikita");
        teacher.evaluate(student);
    }
}
