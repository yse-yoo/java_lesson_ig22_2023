package sample;

public class Method {
    
    public static void main(String[] args) {
        Float answer = calculate(2.f);
        System.out.println(answer);
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

}
