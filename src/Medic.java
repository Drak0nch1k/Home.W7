public class Medic extends Hero{

    private int healPoints;

    public Medic(int health, int damage, String ultimateType, int healPoints) {
        super(health, damage, ultimateType);
        this.healPoints=healPoints;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic health: " + getHealth() + ", Medic damage: " +
                getDamage() + ", Medic super: " + getUltimateType());
        System.out.println("Medic use " + getUltimateType());

    }


    public void  increaseExperience() {
        healPoints*=1.1;
        System.out.println("Medic increased health " + healPoints);

    }
}
