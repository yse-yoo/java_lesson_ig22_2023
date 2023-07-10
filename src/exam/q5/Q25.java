package exam.q5;

public class Q25 {
    public static void main(String[] args) {
        int[][] t = {
            {1, 2}, //0
            {3, 4}, //1
            {5}     //2
        };
        for (int[] a : t) {
            for (int n : a) {
               System.out.print(n + ", "); 
            }
        }
    }

}
