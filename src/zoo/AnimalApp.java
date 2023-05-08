package zoo;

public class AnimalApp {
    
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.type = "dog";
        dog.name = "タロー";
        dog.crying = "わん！";

        dog.walk();
        dog.cry();

        Animal cat = new Animal();
        cat.type = "cat";
        cat.name = "ミケ";
        cat.crying = "にゃー";

        cat.cry();
        cat.walk();
        cat.escape();
    }

}
