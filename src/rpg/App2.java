package rpg;

public class App2 {
    
    public static void main(String[] args) {
        Wizard wizard = new Wizard("アリス");
        wizard.walk("left");

        Warrior warrior = new Warrior("ボブ");
        warrior.walk("right");
    }

}
