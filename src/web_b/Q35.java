package web_b;

public class Q35 {
    public static void main(String[] args) {
        float average = 0;        
        average = calculateAverage(450, 0);

        System.out.println(average);
    }

    public static float calculateAverage(int score, int count) {
        float answer = 0;
        try {
            answer = score / count;
        } catch (Exception e) {
            System.out.println("Exception");
        }
        return answer;
    }
}
