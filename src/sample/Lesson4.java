package sample;

import java.util.Random;

public class Lesson4 {

    public static void main(String[] args) {

        // Array(immutable)
        String[] items = { "PC", "TV", "エアコン" };
        // fori
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
        // foreach
        for (String item : items) {
            System.out.println(item);
        }

        // 預金（よきん）
        float deposit = 1000000;
        // 目標額（もくひょうがく）
        float target = 2000000;
        // 金利（きんり）(1%)
        float interest = 0.01f;
        // 年数
        int year = 0;

        while (deposit < target) {
            deposit *= (1 + interest);
            year++;
        }
        System.out.println(year + "年");

        // 9 x 9
        int answer = 0;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                answer = i * j;
                System.out.print(answer + " ");
            }
            System.out.println("");
        }

        // 5 x 5
        Random rand = new Random();
        String[] marks = { "○", "●" };

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                int markIndex = rand.nextInt(marks.length);
                String result = "|" + marks[markIndex];
                System.out.print(result);
            }
            System.out.println("|");
        }
    }

}
