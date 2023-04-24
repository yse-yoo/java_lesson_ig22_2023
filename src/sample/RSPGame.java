package sample;

import javax.print.attribute.standard.Sides;

public class RSPGame {
    
    public static void main(String[] args) {
        // グー、チョキ、パー
        final int ROCK = 0;        
        final int SCISSORS = 1;        
        final int PAPER = 2;        
        
        // Playerの手
        int playerHand = SCISSORS;
        // PCの手
        int pcHand = SCISSORS;

        // 対戦結果: 0 = 引き分け(draw）、1 = PCの勝ち 、2 = Playerの勝ち
        int result = (playerHand - pcHand + 3) % 3;
        System.out.println("Result:" + result);

        String message = "";
        if (result == 0) {
            message = "引き分け";
        } else if (result == 1) {
            message = "PCの勝ち";
        } else {
            message = "Playerの勝ち";
        }
        System.out.println(message);
    }

}
