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
    }

}
