import token.Token;

import java.util.List;

public class Main {

    private static final String input = "72 * x12 + 175";

    public static void main(String[] args) {

        List<Token> result = new Scanner(input, new SimpleTokenFactory()).scan();

        result.forEach(token -> System.out.println(token.toString()));

    }
}
