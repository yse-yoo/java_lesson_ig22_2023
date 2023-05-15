package rpg;

public class Warrior extends Character {

    public Warrior(String name) {
        super(name);
        this.job = "warrior";
        this.hp = 50;
        this.mp = 0;
        this.attackPower = 7;
        this.defencePower = 5;
    }
    
    @Override
    public void attack(Character character) {
        System.out.println("Override!!");
        // attackPower を一時保存（いちじほぞん）
        int attackPower = this.attackPower;

        // attackPower を2倍にして攻撃（こうげき）
        this.attackPower *= 2;
        super.attack(character);

        // attackPowerを戻す
        this.attackPower = attackPower;
    }

}
