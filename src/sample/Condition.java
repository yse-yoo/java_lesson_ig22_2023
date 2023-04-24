package sample;

import java.util.Calendar;

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
        String weekday = "金";
        String garbage = "";
        // 曜日のindexの取得
        // 日:1 月:2 火:3 水:4 木:5 金:6 土:7
        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(week);

        switch (week) {
            case 2:
            case 6:
                garbage = "燃えるゴミ";    
                break;
            case 4:
                garbage = "燃えないゴミ";    
                break;
            default:
                garbage = "回収なし";    
                break;
        }
        System.out.println(garbage);
    }

}
