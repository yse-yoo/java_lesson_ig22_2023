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
                System.out.println(plot);
            }
        }
    }

}
