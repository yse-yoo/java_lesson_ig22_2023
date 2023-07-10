package exam.q5;

public class Q28 {
    public static void main(String[] args) {
        //RGB
        //#FF0000 = RED
        //#0000FF = BLUE
        //16進数
        int x = 0x1a; //16 + 10 = 26
        int y = 0x15; //16 + 5 = 21

        int answer = x + y;
        System.out.println(answer);

        answer = x ^ y;
        System.out.println(answer);
    }
}
