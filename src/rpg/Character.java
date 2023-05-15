package rpg;

public class Character {
    
    //コンストラクタ（Constructor）
    public Character(String name) {
        System.out.println("New Character");
        this.name = name;
        // this.job = job;
        this.hp = 50;
    }

    //初期化ブロック(Object Initialize Block)
    {
        System.out.println("Initialize");
        this.level = 1;
    }

    // フィールド（プロパティ）
    // 名前
    public String name;
    // 職業
    public String job;
    // 体力
    public int hp;
    // MP
    public int mp;
    // Level
    public int level;

    // class method(instnace method)
    // 歩く
    public void walk(String direction) {
       String message = this.name + " move to " + direction;
       System.out.println(message);
    }
    // 話す
    public void talk(Character character, String message) {
        message = character.name + "!" + message;
        System.out.println(message);
    }
    // 攻撃（こうげき）する
    public void attack(Character character) {
        int damage = 5;
        character.hp -= damage;
    }
}

