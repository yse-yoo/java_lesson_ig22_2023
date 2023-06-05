package rpg.item;

public class Item {

    private long id;

    private String name;
    private int attackPower;
    private int defencePower;
    private int price;
    private ItemType type;

    //Constructor
    public Item(long id, String name, int attackPower, int defencePower, int price, ItemType type) {
        this.id = id;
        this.name = name;
        this.attackPower = attackPower;
        this.defencePower = defencePower;
        this.price = price;
        this.type = type;
    }


    public Item(String name, int attackPower, int defencePower, int price) {
        this.name = name;
        this.attackPower = attackPower;
        this.defencePower = defencePower;
        this.price = price;
    }

    public Item(String name, int attackPower, int defencePower, int price, ItemType type) {
        this.name = name;
        this.attackPower = attackPower;
        this.defencePower = defencePower;
        this.price = price;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }
    
}
