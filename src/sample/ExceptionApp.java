package sample;

public class ExceptionApp {
    
    public static void main(String[] args) {
        int score = 100;
        int count = 0;        
        float avarage = 0;

        avarage = calculateAverage(score, count);
        System.out.println(avarage);
    }

    public static float calculateAverage(int score, int count) {
        float average = 0;
        try {
            average = score / count;
        } catch (Exception e) {
            System.err.println("countが間違っています。");
        }
        return average;
    }
}
