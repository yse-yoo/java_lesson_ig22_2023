package rpg;

public class App {
    
    public static void main(String[] args) {
        Character wizard = new Character("アリス", "Wizard");
        System.out.println(wizard.name);
        System.out.println(wizard.job);
        System.out.println(wizard.hp);

        wizard.walk("left");

        Character warrior = new Character("ボブ", "Warrior");
        System.out.println(warrior.name);
        System.out.println(warrior.job);
        System.out.println(warrior.hp);

        wizard.talk(warrior, "勝負しましょう！");
        wizard.attack(warrior);
        System.out.println(warrior.hp);
    }

}
