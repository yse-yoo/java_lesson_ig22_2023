package zoo;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
        this.type = "dog";
        this.crying = "わん！";
    }
    
    @Override
    public void walk() {
        String message = this.name + "が楽しそうに歩いています";
        System.out.println(message);
    }

}
