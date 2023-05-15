package rpg;

import java.util.Random;

public class Warrior extends Character {

    public Warrior(String name) {
        super(name);
        this.job = "warrior";
        this.hp = 50;
        this.mp = 0;
        this.attackPower = 7;
        this.defencePower = 3;
    }
    
    @Override
    public void attack(Character character) {
        System.out.println("Override!!");
        // attackPower を一時保存（いちじほぞん）
        int attackPower = this.attackPower;

        // クリティカルヒット（ランダム）
        Random rand = new Random();
        if (rand.nextInt(5) == 0) {
            // attackPower を2倍にして攻撃（こうげき）
            this.attackPower *= 2;
        }
        super.attack(character);

        // attackPowerを戻す
        this.attackPower = attackPower;
    }

}
