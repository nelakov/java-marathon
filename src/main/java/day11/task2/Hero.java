package day11.task2;

public abstract class Hero implements PhysAttack {
    final int MIN_HEALTH = 0;
    final int MAX_HEALTH = 100;
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

    @ Override
    public String toString() {
        return "Hero [health=" + health + ", physDef=" + physDef + ", magicDef=" + magicDef + ", physAtt=" + physAtt
                + "]";
    }

}
