package rpg.item;

public class Item {
    private String name;
    private int attackPower;
    private int defencePower;
    private int price;

    public Item(String name, int attackPower, int defencePower, int price) {
        this.name = name;
        this.attackPower = attackPower;
        this.defencePower = defencePower;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getDefencePower() {
        return defencePower;
    }

    public void setDefencePower(int defencePower) {
        this.defencePower = defencePower;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    
}
