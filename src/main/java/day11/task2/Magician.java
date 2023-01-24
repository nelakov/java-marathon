package day11.task2;

public class Magician extends Hero implements MagicAttack {
    final int PHYS_ATTACK = 5;
    final double MAGIC_ATTACK = 20;
    final double MAGIC_DEFENSE = 0.8;

    public Magician() {
        physDef = 0;
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
    public String toString() {
        return "Magician {" +
                "health = "+
                health + " }";
    }

}
