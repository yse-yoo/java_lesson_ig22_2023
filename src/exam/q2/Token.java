package exam.q2;

public class Token implements Identifiable {
    static long number = 1;
    long num;
    String attribute;

    public Token() {
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
