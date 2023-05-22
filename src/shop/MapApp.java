package shop;

import java.util.HashMap;

public class MapApp {
    
    public static void main(String[] args) {
        HashMap<String, Drink> drinkMap = new HashMap<>();
        drinkMap.put("D0001", new Drink("コーヒー", 350));
        drinkMap.put("D0002", new Drink("紅茶", 400));
        drinkMap.put("D0003", new Drink("ほうじ茶", 300));

        // keySet(): key List を取得
        for (String code : drinkMap.keySet()) {
           System.out.println(code); 
        }

        // values(): value List を取得
        for (Drink drink : drinkMap.values()) {
            System.out.println(drink.name);
        }

        // get()
        System.out.println("--- get by key ---");
        Drink selectDrink = drinkMap.get("D0001");
        System.out.println(selectDrink.name);

        // remove()
        System.out.println("--- remove() ---");
        drinkMap.remove("D0001");
        for (Drink drink : drinkMap.values()) {
            System.out.println(drink.name);
        }

        // size()
        int drinkCount = drinkMap.size();
        System.out.println(drinkCount);

    }

}
