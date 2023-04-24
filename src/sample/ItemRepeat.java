package sample;

public class ItemRepeat {
    
    public static void main(String[] args) {
        
        // コードアシスタント: fori
        // 0 - 9
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // 1 - 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //for のネスト
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                String plot = "(" + i + ", " + j + ")";
                System.out.print(plot);
            }

            System.out.println("");
        }

        // fori: repeat array
        String[] drinks = { "コーヒー", "紅茶", "ほうじ茶" };
        for (int i = 0; i < drinks.length; i++) {
            System.out.println(drinks[i]);
        }

        // foreach: repeat array
        for (String drink : drinks) {
            System.out.println(drink);
        }

        // while
        int i = 0;
        while (i <= 10) {
            i++;
        }
        System.out.println(i);

        int currentNumber = 1;
        int maxNumber = 1000;
        int div = 7;
        int index = 0;
        int limit = 5;

        //現在の数字が、最大の数字より小さいときは、ずっとくりかえす。
        while (currentNumber < maxNumber) {
            if (currentNumber % div == 0) {
                System.out.println(currentNumber);
                index++;
            }
            if (index == limit) {
                break;
            }
            currentNumber++;
        }
    }

}
