package shop;

import java.util.ArrayList;

public class ListApp {
    
    public static void main(String[] args) {
        ArrayList<Drink> drinkList = new ArrayList<>();
        drinkList.add(new Drink("コーヒー", 350, 100));
        drinkList.add(new Drink("紅茶", 400, 10));
        drinkList.add(new Drink("ほうじ茶", 300, 50));

        System.out.println("--- Drink List ---");
        for (Drink drink : drinkList) {
            System.out.println(drink.name);
        }

        System.out.println("--- Drink get(1) ---");
        Drink selectDrink = drinkList.get(1);
        System.out.println(selectDrink.name);

        System.out.println("--- Drink set(0) ---");
        drinkList.set(0, new Drink("アイスコーヒー", 250, 50));
        for (Drink drink : drinkList) {
            System.out.println(drink.name);
        }

        System.out.println("--- Drink remove(2) ---");
        drinkList.remove(2);
        for (Drink drink : drinkList) {
            System.out.println(drink.name);
        }
    }

}
