package exam.q5;

public class Q29 {
    public static void main(String[] args) {
        double width = 12.0, height = 24.0, result = 0;
        Type type = Type.A;
        switch (type) {
            case A:
                result = width * height;
                break;
            case B:
                result = width * height / 2;
                break;
        }
        System.out.println(result);
    }
}
