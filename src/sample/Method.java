package sample;

public class Method {
    
    public static void main(String[] args) {
        Float answer = calculate(2.f);
        System.out.println(answer);

        //実行できない
        // answer = calculate2(answer);

        int totalPrice = claculateTotalPrice(200, 5);
        System.out.println(totalPrice + "円");

        totalPrice = claculateTotalPrice(200, 5, 0.1f);
        System.out.println(totalPrice + "円");

        greet("YSE");
        greet("YSE", "雨");
        greet("東京　太郎");
    }

    //static method
    public static Float calculate(Float x) {
        Float y = x + 5;
        return y;
    }

    public Float calculate2(Float x) {
        Float y = x + 5;
        return y;
    }

    // 合計金額（ごうけいきんがく）の計算
    // int price, int amount
    public static int claculateTotalPrice(int price, int amount) {
        int totalPrice = price * amount;
        return totalPrice;
    }

    //overload
    // int price, int amount, float taxRate 
    public static int claculateTotalPrice(int price, int amount, float taxRate) {
        float totalPrice = price * amount * (1 + taxRate);
        return (int) totalPrice;
    }


    public static void greet(String name) {
       String message = name + "さん、こんにちは！"; 
       System.out.println(message);
    }

    public static void greet(String name, String weather) {
       String message = name + "さん。今日は" + weather + "ですね"; 
       System.out.println(message);
    }

}
