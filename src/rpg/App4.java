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
    }

}
