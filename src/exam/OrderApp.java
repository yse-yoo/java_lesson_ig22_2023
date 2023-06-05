package exam;

import exam.model.Drink;
import exam.model.Food;
import exam.model.Order;

public class OrderApp {

    public static void main(String[] args) {
        Food food1 = new Food("キーマカレー", 650);
        Food food2 = new Food("カルボナーラ", 800);
        Drink drink1 = new Drink("コーヒー", 350);

        Order order = new Order();
        // order.add(food1);
        // order.add(food2);
        // order.add(drink1);
        order.add(food1, 2);
        order.add(food2, 1);
        order.add(drink1, 2);

        order.confirm();
        order.calculateTotalPrice();

        pay(order);
    }

    public static void pay(Order order) {
        // program
        order.pay();
        int change = 5000 - order.getTotalPrice();
        System.out.println("おつりは" + change + "円です");

        order.pay(5000);
    }

}
