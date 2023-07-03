package lambda;

public class CalculateApp {
    
    public static void main(String[] args) {
        ICalculate calucate = new ICalculate() {
            @Override
            public Integer totalPrice(Integer price) {
                Float totalPrice = price * 1.1f;
                return totalPrice.intValue();
            }
        };

        Integer result = calucate.totalPrice(500);
        System.out.println(result); 
    }

}
