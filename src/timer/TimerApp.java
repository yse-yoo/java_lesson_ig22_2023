package timer;

import java.util.Timer;
import java.util.TimerTask;

public class TimerApp {
    public static int seconds = 3;
    public static void main(String[] args) {
        System.out.println(seconds + "秒後に実行されます。");

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("実行しました！");
            }
        };

        //micro seconds に変換
        int ms = seconds * 1000;

        Timer timer = new Timer();
        timer.schedule(task, ms);
    }

}
