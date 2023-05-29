package rpg;

import rpg.item.Item;

public class Character implements ICharacter {
    //初期化ブロック(Object Initialize Block)
    {
        System.out.println("Initialize");
    }
    
    //コンストラクタ（Constructor）
    public Character(String name) {
        this.name = name;
        this.level = 1;
        this.exp = 0;
    }

    public Character(String name, String job) {
        this.name = name;
        this.job = job;
        this.level = 1;
        this.exp = 0;
    }

    // フィールド（プロパティ）
    public String name;
    public String job;
    public int hp;
    public int mp;
    public int level;
    public int exp;
    public int attackPower;
    public int defencePower;


    // class method(instnace method)
    public void walk(String direction) {
       String message = this.name + " move to " + direction;
       System.out.println(message);
    }

    public void talk(Character character, String message) {
        message = "[" + this.name + "]" + character.name + "!" + message;
        System.out.println(message);
    }

    @Override
    public void attack(Monster monster) {
        int damage = this.attackPower - monster.defencePower;
        if (damage > 0) {
            monster.hp -= damage;
        }
    }

    public void attack(Character character) {
        int damage = this.attackPower - character.defencePower;
        if (damage > 0) {
            character.hp -= damage;
        }
    }
    public void greet(String message) {
        System.out.println(message);
    }

    @Override
    public boolean isAlive() {
        return (this.hp > 0);
    }

    @Override
    public void magic(Monster monster, String key) {
        if (this.mp > 0) {
            System.out.println("Magic attack");
        }
    }

    @Override
    public void equip(Item item) {
        this.attackPower += item.attackPower;
        this.defencePower += item.defencePower;
    }

    // Getters & Setters: Ctrl + . 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getDefencePower() {
        return defencePower;
    }

    public void setDefencePower(int defencePower) {
        this.defencePower = defencePower;
    }

}

