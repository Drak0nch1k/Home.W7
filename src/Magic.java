import java.sql.PreparedStatement;

public class Magic extends Hero{
    public Magic(int health, int damage, String ultimateType) {
        super(health, damage, ultimateType);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic health: " + getHealth() + ", Magic Damage: " + getDamage() +
                ", Magic super: " + getUltimateType());
        System.out.println("Magic use "+ getUltimateType());
    }
}