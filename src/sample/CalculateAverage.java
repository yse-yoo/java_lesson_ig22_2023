package sample;

import java.util.Scanner;

public class CalculateAverage {
    
    public static void main(String[] args) {
        //Standard Input（標準入力）
        Scanner sc = new Scanner(System.in);

        System.out.println("Input score of Japanese!");
        int japanese = sc.nextInt();

        System.out.println("Input score of Mathmatic!");
        int mathmatic = sc.nextInt();

        System.out.println("Input score of Science!");
        int science = sc.nextInt();

        System.out.println("Input score of Society!");
        int society = sc.nextInt();

        float average = (japanese + mathmatic + science + society) / 4.0f;
        String message = "Score average is " + average;
        System.err.println(message);
    }

}
