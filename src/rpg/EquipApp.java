package rpg;

import rpg.item.Item;

public class EquipApp {
    
    public static void main(String[] args) {
        Wizard wizard1 = new Wizard("アリス");
        Item weapon1 = new Item("ブロンズナイフ", 4, 0, 300);
        Item shield = new Item("ブロンズシールド", 0, 3, 500);

        System.out.println(wizard1.getName());
        System.out.println("attack power:" + wizard1.getAttackPower());
        System.out.println("defence power:" + wizard1.getDefencePower());

        // equip
        wizard1.equip(weapon1);
        wizard1.equip(shield);

        System.out.println("attack power:" + wizard1.getAttackPower());
        System.out.println("defence power:" + wizard1.getDefencePower());

    }
}
