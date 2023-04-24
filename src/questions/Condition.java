package questions;

public class Condition {

    public static void main(String[] args) {
        int age = 18;
        boolean isBlackList = false;
        int income = 1000000;
        String message = "クレジットカードを作成できません";

        if (!isBlackList && age >= 18 && age < 65) {
            if (income > 1000000) {
                message = "クレジットカード作成可能です";
            } else {
                message = "審査が必要です";
            }
        }
        System.out.println(message);
    }
}
