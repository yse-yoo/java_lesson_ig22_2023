package rpg;

public class App2 {
    
    public static void main(String[] args) {
        Wizard wizard = new Wizard("アリス");
        wizard.walk("left");

        Warrior warrior = new Warrior("ボブ");
        warrior.walk("right");
        warrior.greet("こんにちは");

        warrior.attack(wizard);
        System.out.println(wizard.getHp());
        wizard.attack(warrior);
        System.out.println(warrior.getHp());
    }

}
