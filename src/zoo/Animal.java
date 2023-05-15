package zoo;

public class Animal {
    
    public Animal(String name) {
        this.name = name;
    }

    String type;
    String name;
    String crying;

    public void walk() {
        String message = this.name + "が歩いた";
        System.out.println(message);
    }

    public void cry() {
        System.out.println(this.crying);
    }

    public void escape() {
        String message = this.name + "が逃げた";
        System.out.println(message);
    }
}
