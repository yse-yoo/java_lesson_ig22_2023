package timer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class DateTimerApp {
    public static long interval = 3;
    public static long count = 0;
    public static long maxCount = 5;

    public static void main(String[] args) throws ParseException {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.MONTH, 6);
        calendar.set(Calendar.DATE, 3);
        calendar.set(Calendar.HOUR_OF_DAY, 12);
        calendar.set(Calendar.MINUTE, 14);
        calendar.set(Calendar.SECOND, 0);

        Date scheduledTime = calendar.getTime();

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("タイマーが実行されました。");
                timer.cancel();
            }
        };
        timer.schedule(task, scheduledTime);
    }

}
