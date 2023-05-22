package shop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorApp {
    
    public static void main(String[] args) {
        ArrayList<Drink> drinkList = new ArrayList<>();
        drinkList.add(new Drink("コーヒー", 350, 100));
        drinkList.add(new Drink("紅茶", 400, 10));
        drinkList.add(new Drink("ほうじ茶", 300, 50));

        // Iterator
        Iterator<Drink> drinkIterator = drinkList.iterator();
        // データがあればずっと繰り返す
        while (drinkIterator.hasNext()) {
            Drink drink = drinkIterator.next();
            System.out.println(drink.name);
        }

        // ListIterator
        ListIterator<Drink> listIterator = drinkList.listIterator();
        listIterator.add(new Drink("カフェモカ", 350));
        listIterator.previous();

        System.out.println("--- List Iterator ---");
        while (listIterator.hasNext()) {
            Drink drink = listIterator.next();
            System.out.println(drink.name);
        }

    }
}
