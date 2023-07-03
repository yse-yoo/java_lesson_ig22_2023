package lambda;

public class RunableApp {
    public static void main(String[] args) {
        Runnable runner = ()-> System.out.println("Hello!");
        runner.run();
    }

}
