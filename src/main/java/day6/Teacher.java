package day6;

import java.util.Random;

public class Teacher {
    private static final int MIN_GRADE = 2;
    private static final int MAX_GRADE = 4;

    private String name;
    private String science;

    public Teacher(String name, String science) {
        this.name = name;
        this.science = science;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScience(String science) {
        this.science = science;
    }

    public String getName() {
        return name;
    }

    public String getScience() {
        return science;
    }

    public void evaluate(Student student) {
        System.out.println("Teacher " + name + " evaluate student with name " + student.getName() + "\n"
            + "Subject " + science + "\n"
            + "Evaluation " + evaluation());
    }

    public String evaluation() {
        Random random = new Random();
        int grade = random.nextInt(MIN_GRADE, MAX_GRADE + 1);
        return switch (grade) {
            case 2 -> "BAD";
            case 3 -> "WITH BEAR GOOD";
            case 4 -> "GOOD";
            default -> throw new IllegalStateException("Unexpected grade: " + grade);
        };
    }
}
