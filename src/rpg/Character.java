package rpg;

public class Character {
    // フィールド（プロパティ）
    // 名前
    String name;
    // 職業
    String job;
    // 体力
    int hp;

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

