package rpg;

public class Monster {

    public Monster(String name) {
        this.name = name;
        this.hp = 10;
        this.mp = 0;
        this.attackPower = 100;
        this.defencePower = 2;
    }

    public String name;
    public int hp;
    public int mp;
    public int attackPower;
    public int defencePower;

    public void attack(Character character) {
        int damage = this.attackPower - character.defencePower;
        if (damage > 0) {
            character.hp -= damage;
        }
    }

}
