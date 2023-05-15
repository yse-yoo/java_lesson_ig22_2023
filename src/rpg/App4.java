package rpg;

import java.util.ArrayList;

public class App4 {
    
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("コーヒー");
        drinks.add("紅茶");
        drinks.add("ほうじ茶");

        for (String drink : drinks) {
            System.out.println(drink);
        }
        int drinkCount = drinks.size();
        System.out.println(drinkCount);

        // Array
        // String selectDrink = drinks[1];

        // Array List
        System.out.println("---- データ取得: get() ----");
        String selectDrink = drinks.get(1);
        System.out.println(selectDrink);

        drinks.set(1, "オレンジジュース");
        System.out.println("---- データ更新: set() ----");
        for (String drink : drinks) {
            System.out.println(drink);
        }

        System.out.println("---- データ追加: add() ----");
        drinks.add("ウーロン茶");
        for (String drink : drinks) {
            System.out.println(drink);
        }

        System.out.println("---- データ削除: remove() ----");
        drinks.remove(0);
        for (String drink : drinks) {
            System.out.println(drink);
        }

    }

}
