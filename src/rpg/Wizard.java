package rpg;

public class Wizard extends Character {

    public Wizard(String name) {
        super(name);
        this.setJob("wizard");
        this.setHp(30);
        this.setMp(20);
        this.setAttackPower(4);
        this.setDefencePower(3);
    }
    
}
