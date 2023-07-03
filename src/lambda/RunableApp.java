package lambda;

public class RunableApp {
    public static void main(String[] args) {
        Runnable runner = () -> System.out.println("Hello!");
        runner.run();

        greet(() -> showMessage("YSE!"));
    }

    public static void showMessage(String message) {
        System.out.println(message);
    }

    public static void greet(Runnable runner) {
        runner.run();
    }
}
