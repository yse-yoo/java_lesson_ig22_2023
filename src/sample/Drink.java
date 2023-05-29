package sample;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Drink {

    public static void main(String[] args) {
        // Array : イミュータブル（immutable）
        String[] drinks = { "コーヒー", "紅茶", "ほうじ茶" };
        // 追加・削除できない
        //drinks.add("ウーロン茶");
        //drinks.remove(0);
        // Python, JavaScript, PHP
        // drinks = ["コーヒー", "紅茶", "ほうじ茶"]

        System.out.println(drinks);
        System.out.println(Arrays.toString(drinks));

        // index = 1 のデータの取得
        String selectDrink = drinks[1];
        System.out.println(selectDrink);

        // index = 1 のデータを更新
        drinks[1] = "ウーロン茶";
        System.out.println(Arrays.toString(drinks));

        // prices(int型、Integer型)の配列
        Integer[] prices = { 350, 400, 300 };
        System.out.println(Arrays.toString(prices));
        Integer selectPrice = prices[1];
        System.out.println(selectPrice);

        // RSPの配列: グー、チョキ、パー
        String[] hands = { "グー", "チョキ", "パー" };
        System.out.println(Arrays.toString(hands));

        // random
        Random random = new Random();
        int handIndex = random.nextInt(3);
        String pcHand = hands[handIndex];

        System.out.println(handIndex);
        System.out.println(pcHand);

        String[] foods = { "Apple", "Grape", "Peach" };
        foods[1] = "Orange";
        System.out.println(Arrays.toString(foods));
    }
}
