package day11.task2;

public class Shaman extends Hero implements MagicAttack, Healer {
    final int MAGIC_ATTACK = 15;
    final int PHYS_ATTACK = 10;
    final double MAGIC_DEFENSE = 0.2;
    final double PHYS_DEFENSE = 0.2;
    final int HEALER_SELF = 50;
    final int HEALER_TEAMMATE = 30;

    public Shaman() {
        physDef = PHYS_DEFENSE;
        magicDef = MAGIC_DEFENSE;
        physAtt = PHYS_ATTACK;
    }

    @Override
    public void magicalAttack(Hero hero) {
        double damage = MAGIC_ATTACK * (1 - hero.magicDef);
        if (health == MIN_HEALTH) {
            System.out.println("Hero alredy death! Don't hit the dead");
            return;
        }

        double healthAfterDamage = hero.health - damage;
        if (healthAfterDamage < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= healthAfterDamage;
        }

    }

    @Override
    public void healHimself() {
        int heal = health + HEALER_SELF;
        if (health == MAX_HEALTH) {
            System.out.println("The hero is healthy! Don't pretend!");
        } else if (heal > MAX_HEALTH) {
            health = MAX_HEALTH;
        } else {
            health = heal;
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
        return "Shaman {" +
                "health = " +
                health + " }";
    }

}

