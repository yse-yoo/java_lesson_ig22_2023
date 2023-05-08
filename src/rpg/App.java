package rpg;

public class App {
    
    public static void main(String[] args) {
        Character wizard = new Character();
        wizard.name = "アリス";
        wizard.job = "Wizard";
        wizard.hp = 30;
        System.out.println(wizard.name);
        System.out.println(wizard.job);
        System.out.println(wizard.hp);

        wizard.walk("left");

        Character warrior = new Character();
        warrior.name = "ボブ";
        warrior.job = "Warrior";
        warrior.hp = 80;
        System.out.println(warrior.name);
        System.out.println(warrior.job);
        System.out.println(warrior.hp);

        wizard.talk(warrior, "勝負しましょう！");
        wizard.attack(warrior);
        System.out.println(warrior.hp);
    }

}
