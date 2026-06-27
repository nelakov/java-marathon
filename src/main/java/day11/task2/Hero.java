package day11.task2;

public abstract class Hero implements PhysAttack {
    static final int MIN_HEALTH = 0;
    static final int MAX_HEALTH = 100;
    int health;
    int physAtt;
    double physDef;
    double magicDef;

    public Hero() {
        health = MAX_HEALTH;

    }

    @Override
    public void physicalAttack(Hero hero) {
        double damage = physAtt * (1 - hero.physDef);

        if (hero.health == MIN_HEALTH) {
            System.out.println("Hero alredy death! Don't hit the dead");
            return;
        }

        if (hero.health - damage < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= damage;
        }

    }

    protected void applySelfHeal(int amount) {
        int cured = health + amount;
        if (health == MAX_HEALTH) {
            System.out.println("The hero is healthy! Don't pretend!");
        } else if (cured > MAX_HEALTH) {
            health = MAX_HEALTH;
        } else {
            health = cured;
        }
    }

    protected void applyTeammateHeal(Hero hero, int amount) {
        int curedTeammate = hero.health + amount;
        if (hero.health == MAX_HEALTH) {
            System.out.println("Bastard! You are healthy! Don't pretend!");
        } else if (curedTeammate > MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        } else {
            hero.health = curedTeammate;
        }
    }

    @Override
    public String toString() {
        return "Hero [health=" + health + ", physDef=" + physDef + ", magicDef=" + magicDef + ", physAtt=" + physAtt
                + "]";
    }

}
