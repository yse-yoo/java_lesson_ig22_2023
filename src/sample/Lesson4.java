package sample;

public class Lesson4 {
    
    public static void main(String[] args) {
        
        String[] items = { "PC", "TV", "エアコン" };
        // fori
        for (int i = 0; i < items.length ; i++) {
            System.out.println(items[i]);
        }
        //foreach
        for (String item : items) {
            System.out.println(item);
        }

        //預金（よきん）
        float deposit = 1000000;
        //目標額（もくひょうがく）
        float target = 2000000;
        //金利（きんり）(1%)
        float interest = 0.01f; 
        //年数
        int year = 0;

        while (deposit < target) {
            deposit *= (1 + interest);
            year++;
        }

        System.out.println(year + "年");
    }

}
