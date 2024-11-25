public abstract class Hero implements HavingSuperAbility {
    private int health;
    private int damage;
    private String ultimateType;

    public Hero(int health, int damage, String ultimateType) {
        this.health=health;
        this.damage=damage;
        this.ultimateType=ultimateType;
    }


    public int getHealth() {
        return health;
    }



    public int getDamage() {
        return damage;
    }




    public String getUltimateType() {
        return ultimateType;
    }


}
