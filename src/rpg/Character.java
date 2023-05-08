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
}

