package zoo;

public class AnimalApp {
    
    public static void main(String[] args) {
        Dog dog = new Dog("タロー");
        dog.walk();
        dog.cry();

        Cat cat = new Cat("ミケ");
        cat.cry();
        cat.walk();
        cat.escape();
    }

}
