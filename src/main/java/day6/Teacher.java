/*
package day6;

import java.util.Random;

public class Teacher {
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
        Random random = new Random();
        int evaluation = random.nextInt(5);

        System.out.println("Teacher " + name + " evaluate student with name " + student.getName() + "\n" + "Subject " + science + "\n" + "Evaluation " + evaluation());
    }

    public String evaluation() {
        Random random = new Random();
        int evaluationInt = random.nextInt(2, 5);
        String evaluation = null;
        switch (evaluationInt) {
            case 2:
                evaluation = "BAD";
                break;

            case 3:
                evaluation = "WITH BEAR GOOD";
                break;

            case 4:
                evaluation = "GOOD";
                break;
            case 5:
                evaluation = "THE BEST";
                break;
        }
        return evaluation;
    }

}
*/
