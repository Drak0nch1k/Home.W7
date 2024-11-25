public class Warrior extends Hero{


    public Warrior(int health, int damage, String ultimateType) {
        super(health, damage, ultimateType);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Warrior health: " + getHealth() + ", Warrior damage: " +
                getDamage() + ", Warrior super: " + getUltimateType());
        System.out.println("Warrior use " + getUltimateType());

    }


}
