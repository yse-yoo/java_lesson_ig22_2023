package zoo;

public class Animal {
    
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
}
