package lambda;

public class CalculateApp {

    public static void main(String[] args) {
        // ICalculate calculate = new ICalculate() {
        //     @Override
        //     public Integer totalPrice(Integer price) {
        //         Float totalPrice = price * 1.1f;
        //         return totalPrice.intValue();
        //     }
        // };

        // ラムダ式
        ICalculate calculate = (price) -> {
            Float totalPrice = price * 1.1f;
            return totalPrice.intValue();
        };
        Integer result = calculate.totalPrice(500);
        System.out.println(result);
    }

}
