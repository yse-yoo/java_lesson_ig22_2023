package rpg;

import rpg.item.Item;
import rpg.item.ItemList;

public class ItemListApp {
    
    public static void main(String[] args) {
        ItemList itemList = new ItemList();

        for (Item item : itemList.list) {
            System.out.println(item.getName());
        }

        // 
        System.out.println("---- index = 3 ----");
        System.out.println(itemList.list.get(3).getName());

        System.out.println("---- index = 0 ----");
        System.out.println(itemList.list.get(0).getType());
    }

}
