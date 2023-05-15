package rpg;

public class App2 {
    
    public static void main(String[] args) {
        Wizard wizard = new Wizard("アリス");
        wizard.walk("left");

        System.out.println(wizard.name);
    }

}
