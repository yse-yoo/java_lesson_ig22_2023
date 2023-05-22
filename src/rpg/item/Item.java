package rpg.item;

public class Item {
    public String name;
    public int attackPower;
    public int defencePower;
    public int price;

    public Item(String name, int attackPower, int defencePower, int price) {
        this.name = name;
        this.attackPower = attackPower;
        this.defencePower = defencePower;
        this.price = price;
    }

    
}
