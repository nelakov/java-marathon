package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {
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
        int cured = health + HEALER_SELF;
        if (health == MAX_HEALTH) {
            System.out.println("The hero is healthy! Don't pretend!");
        } else if (cured > MAX_HEALTH) {
            health = MAX_HEALTH;
        } else {
            health = cured;
        }

    }

    @Override
    public void healTeammate(Hero hero) {
        int healthTeammate = hero.health + HEALER_TEAMMATE;

          if (hero.health == MAX_HEALTH) {
            System.out.println("Bastard! You are healthy! Don't pretend!");
        } else if (healthTeammate > MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        } else {
            hero.health = healthTeammate;
        }
    }

    @Override
    public String toString() {
        return "Paladin {" +
                "health = "+
                 health + " }";
    }

}




