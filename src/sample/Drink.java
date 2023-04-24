package sample;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Drink {

    public static void main(String[] args) {
        // Array
        String[] drinks = { "コーヒー", "紅茶", "ほうじ茶" };
        // Python, JavaScript, PHP
        // drinks = ["コーヒー", "紅茶", "ほうじ茶"]

        System.out.println(drinks);
        System.out.println(Arrays.toString(drinks));

        // index = 1 のデータ
        String selectDrink = drinks[1];
        System.out.println(selectDrink);
    }
}
