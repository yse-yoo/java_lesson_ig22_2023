package rpg;

public class Monster {
    
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
