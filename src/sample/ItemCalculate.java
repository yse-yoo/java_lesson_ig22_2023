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

        //price = price - 10;
        price -= 10;

        //price = price * amount;
        price *= amount;

        System.out.println(price);

        //オーバーフロー（over flow）
        price = 100000;
        amount = 100000;

        totalPrice = price * amount;
        System.out.println(totalPrice);

        long price2 = 100000;
        long amount2 = 100000;
        long totalPrice2 = price2 * amount2;
        System.out.println(totalPrice2);

        //論理演算(Logical calculation)
        boolean is_match = false;
        price = 150;

        // is equal?
        is_match = (price == 100);
        System.out.println(is_match);

        is_match = (price < 100);
        System.out.println(is_match);

        is_match = (price <= 100);
        System.out.println(is_match);

        is_match = (price > 100);
        System.out.println(is_match);

        is_match = (price >= 100);
        System.out.println(is_match);

        is_match = (price != 100);
        System.out.println(is_match);

        int price3 = 100;
        String price4 = "100";
        // complile error
        // is_match = (price3 == price4);

        is_match = (price3 == Integer.parseInt(price4));
        System.out.println(is_match);
    }

}
