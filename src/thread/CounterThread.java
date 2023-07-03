package thread;

public class CounterThread implements Runnable {

    public static Integer count = 5;
    public long interval = 1000;

    @Override
    public void run() {
        while (count >= 0) {
            try {
                Thread.sleep(interval);
                String message = Thread.currentThread().getName() + ":" + count;
                System.out.println(message);
                count--;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
