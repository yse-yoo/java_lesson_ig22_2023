package rpg;

public class BattleApp {
    
    public static void main(String[] args) {
        Battle battle = new Battle();
        battle.addCharacter(new Wizard("アリス"));
        battle.addCharacter(new Wizard("テリー"));
        battle.addCharacter(new Warrior("ボブ"));
        battle.addCharacter(new Warrior("チャーリー"));
        // battle.addCharacter(new Warrior("クリス"));
        battle.start();
    }
}
