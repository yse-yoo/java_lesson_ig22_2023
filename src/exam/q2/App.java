package exam.q2;

public class App {
    
    public static void main(String[] args) {
        String message;

        BracketToken bracketToken = new BracketToken();
        message = bracketToken.getIdentifier();
        System.out.println(message);

        Token token = new Token();
        message = token.getIdentifier();
        System.out.println(message);

        Token token1 = new Token();
        token1.num = 3;

        Token token2 = new Token();
        token2.num = 3;

        Token.number = 10;

    }
}
