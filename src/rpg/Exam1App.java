package rpg;

public class Exam1App {

    public static void main(String[] args) {
        Character monk = new Character("ボブ", 5, 3);
        Character wizard = new Character("アリス", 4, 4);
        while (true) {
            wizard.attack(monk);
            if (!monk.isAlive()) {
                break;
            }
            monk.attack(wizard);
            if (!wizard.isAlive()) {
                break;
            }
        }
        System.out.println(monk.isAlive());
        System.out.println(wizard.isAlive());
    }
}
