package app;

import app.token.Token;

import java.util.List;

public class Main {

    private static final String input = "(( ))()";
    public static void main(String[] args) {

        try {
            List<Token> result = new Scanner(input, new SimpleTokenFactory()).scan();
            result.forEach(token -> System.out.println(token.toString()));
        }
        catch (UnclosedTagException e){
            e.printStackTrace();
        }

    }
}
