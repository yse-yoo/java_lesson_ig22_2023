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
        message = character.name + "!" + message;
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

}

