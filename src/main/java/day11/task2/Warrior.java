package day11.task2;

public class Warrior extends Hero {
    final int PHYS_ATTACK = 30;
    final double PHYS_DEFENSE = 0.8;
    
    public Warrior() {
       physDef = PHYS_DEFENSE;
       physAtt = PHYS_ATTACK;
    }

    @Override
    public String toString() {
        return "Warrior {" +
                "health = "+
                health + " }";
    }

}
