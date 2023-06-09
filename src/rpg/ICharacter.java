package rpg;

import rpg.item.Item;

public interface ICharacter {
    
    public void attack(Monster monster);
    public boolean isAlive();
    public void magic(Monster monster, String key);
    public void equip(Item item);

}
