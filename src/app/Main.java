package app;

import app.token.Token;

import java.util.List;

public class Main {

    private static final String input = "if (1==1) {} @annotation \"adfadf\"x   x\n\nxxfhdh";
    public static void main(String[] args) {

        try {
            List<Token> result = new Scanner(input, new SimpleTokenFactory()).scan();
            result.forEach(token -> System.out.println(token.toString()));

            HtmlPrinter.print(result);
        }
        catch (UnclosedTagException e){
            e.printStackTrace();
        }

    }
}
