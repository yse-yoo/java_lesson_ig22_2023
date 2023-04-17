package sample;

public class Condition {
    
    public static void main(String[] args) {
        int price = 200;
        int money = 100;        
        String message = "";

        if (money > price) {
            message = "お買い上げありがとうございました。";
        }

        System.out.println(message);
    }

}
