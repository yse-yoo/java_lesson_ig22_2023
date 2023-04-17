package sample;

public class ItemCalculate {
    
    public static void main(String[] args) {
        String name = "コーヒー";
        int price = 100;
        int amount = 5;
        boolean isSale = true;

        //snake
        int total_price = price * amount;

        //camel
        int totalPrice = price * amount;

        System.out.println(name);
        System.out.println(total_price);
        System.out.println(totalPrice);
        System.out.println(isSale);

        // Complie Error
        // total_price = name * amount;

        //消費税（comsuption tax）
        // final float TAX_RATE = 0.1f;
        final Float TAX_RATE = 0.1f;
        // TAX_RATE = 0.8f;


        price = 200;
        float pointRate = 0.05f;
        float point = price * pointRate;
        System.out.println("ポイント：" + point + "pt");

        amount = 5;
        //increment
        amount++;
        System.out.println(amount);

        //decrement
        amount--;
        System.out.println(amount);

        //(1) 2項演算
        amount = 3;
        amount = amount + 1;
        System.out.println(amount);

        //(2) 複合演算
        amount = 3;
        amount += 1;
        System.out.println(amount);

        price = 110;
        amount = 3;
        price -= 10;
        price *= amount;
        System.out.println(price);
    }

}
