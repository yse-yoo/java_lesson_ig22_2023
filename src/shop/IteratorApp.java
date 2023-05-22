package shop;

import java.util.ArrayList;

public class IteratorApp {
    
    public static void main(String[] args) {
        ArrayList<Drink> drinkList = new ArrayList<>();
        drinkList.add(new Drink("コーヒー", 350, 100));
        drinkList.add(new Drink("紅茶", 400, 10));
        drinkList.add(new Drink("ほうじ茶", 300, 50));

    }
}
