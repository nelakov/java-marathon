package day11.task2;

public class Paladin extends Hero implements Healer {
    final int HEALER_SELF = 25;
    final int HEALER_TEAMMATE = 10;
    final int PHYS_ATTACK = 15;
    final double PHYS_DEFENSE = 0.5;
    final double MAGIC_DEFENSE = 0.2;

    public Paladin() {
       physDef = PHYS_DEFENSE;
       magicDef = MAGIC_DEFENSE;
       physAtt = PHYS_ATTACK;
    }

    @Override
    public void healHimself() {
        applySelfHeal(HEALER_SELF);
    }

    @Override
    public void healTeammate(Hero hero) {
        applyTeammateHeal(hero, HEALER_TEAMMATE);
    }

    @Override
    public String toString() {
        return "Paladin {" +
                "health = "+
                 health + " }";
    }

}




