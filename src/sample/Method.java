package sample;

public class Method {
    
    public static void main(String[] args) {
        Float answer = calculate(2.f);
        System.out.println(answer);

        //実行できない
        // answer = calculate2(answer);
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

    public static int claculateTotalPrice(int price, int amount) {
        int totalPrice = price * amount;
        return totalPrice;
    }
}
