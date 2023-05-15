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

        Dog dog1 = new Dog("マイケル");
        Dog dog2 = new Dog("ジョン");
        Cat cat1 = new Cat("リサ");
        Cat cat2 = new Cat("ジロー");

        Animal[] animlas = {
            cat1, dog1, dog2, cat2
        };        

        for (Animal animal : animlas) {
            System.out.print(animal.name + ":");
            animal.cry();
            animal.walk();
        }
    }

}
