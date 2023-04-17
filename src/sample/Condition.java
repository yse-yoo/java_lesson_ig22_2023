package sample;

public class Condition {
    
    public static void main(String[] args) {
        int price = -200;
        int money = 100;        
        String message = "";

        if (price < 0) {
            message = "金額がただしくありません。";
        } else if (money > price) {
            message = "お買い上げありがとうございました。";
        } else {
            message = "お金がたりません。";
        }
        System.out.println(message);
    }

}
