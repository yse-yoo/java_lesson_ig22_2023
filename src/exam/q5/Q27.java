package exam.q5;

import java.util.LinkedList;

public class Q27 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();    
        ll.add("1");
        ll.addLast("2");
        ll.addFirst("3");
        for (String s : ll) {
            System.out.println(s);
        }
    }
}
