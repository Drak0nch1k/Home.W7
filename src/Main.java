//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Hero[] heroes = {new Magic(100,50, "Fire ball"), new Warrior(150, 35, "Invulnerable"),
                new Medic(100, 20, "Super hill", 20)};

        for (Hero hero : heroes){
            hero.applySuperAbility();
            if (hero instanceof Medic){
                ((Medic)hero).increaseExperience();
            }
        }

    }
}

