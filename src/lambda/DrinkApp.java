package lambda;

import java.util.ArrayList;

public class DrinkApp {
    
    public static void main(String[] args) {
        ArrayList<Drink> drinks = new ArrayList<>();
        drinks.add(new Drink("コーヒー"));
        drinks.add(new Drink("紅茶"));
        drinks.add(new Drink("ほうじ茶"));

        for (Drink drink : drinks) {
            System.out.println(drink.name);
        }
    }

}
