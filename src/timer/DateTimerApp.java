package timer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class DateTimerApp {
    public static long interval = 3;
    public static long count = 0;
    public static long maxCount = 5;

    public static void main(String[] args) throws ParseException {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println(count);
            }
        };

        // 時間指定
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        Date date = sdf.parse("11:55:00");
        timer.schedule(task, date, interval * 1000);
    }

}
