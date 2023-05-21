package zoo;

public class Animal {
    
    // コンストラクタ
    public Animal(String name) {
        this.name = name;
    }

    // コンストラクタ
	public Animal(String type, String name, String crying) {
		this.type = type;
		this.name = name;
		this.crying = crying;
	}

    public String type;
    public String name;
    public String crying;

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
