package exam.q2;

public class Token implements Identifiable {
    //static 変数
    static long number = 1;
    //インスタンス変数
    long num;
    String attribute;

    public Token() {
        System.out.println("--- Constructor of super class");
        num = number;
        number = number + 1;
    }

    void setAttribute(String attr) {
        attribute = attr;
    }

    public String getIdentifier() {
        return attribute + "#" + num;
    }
    
}
