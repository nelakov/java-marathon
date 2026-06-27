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
        if (hero.health == MIN_HEALTH) {
            System.out.println("Hero alredy death! Don't hit the dead");
            return;
        }

        double healthAfterDamage = hero.health - damage;
        if (healthAfterDamage < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health = (int) healthAfterDamage;
        }

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
        return "Shaman {" +
                "health = " +
                health + " }";
    }

}

