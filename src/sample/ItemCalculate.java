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

    }

}
