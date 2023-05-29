package rpg;

public class App {
    
    public static void main(String[] args) {
        Character wizard = new Character("アリス", "Wizard");
        System.out.println(wizard.getName());
        System.out.println(wizard.getJob());
        System.out.println(wizard.getHp());
        System.out.println(wizard.getLevel());

        wizard.walk("left");

        Character warrior = new Character("ボブ", "Warrior");
        System.out.println(warrior.getName());
        System.out.println(warrior.getJob());
        System.out.println(warrior.getHp());
        System.out.println(warrior.getLevel());

        wizard.talk(warrior, "こんにちわ！");
        wizard.attack(warrior);
        System.out.println(warrior.getHp());
    }

}
