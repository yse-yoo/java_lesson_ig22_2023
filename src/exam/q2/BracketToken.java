package exam.q2;

public class BracketToken extends Token {
    // デフォルトコンストラクタ super()が実行される
    // public BracketToken() {
    //     super();
    //     System.out.println("--- Constructor of BraketToken");
    // }

    public String getIdentifier() {
        return "[" + super.getIdentifier() + "]";
    } 
}
