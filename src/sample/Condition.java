package sample;

public class Condition {
    
    public static void main(String[] args) {
        int price = 400;
        int money = 500;        
        String message = "";

        if (price < 0 || money < 0) {
            // OR
            message = "金額がただしくありません。";
        } else if (money > price) {
            message = "お買い上げありがとうございました。";
        } else {
            message = "お金がたりません。";
        }
        System.out.println(message);

        // switch
        String weekday = "月";
        String garbage = "";

        switch (weekday) {
            case "月":
                garbage = "燃えるゴミ";    
                break;
            case "金":
                garbage = "燃えないゴミ";    
                break;
            default:
                garbage = "回収なし";    
                break;
        }
        System.out.println(garbage);
    }

}
