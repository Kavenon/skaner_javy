package app;

import app.token.Token;

import java.util.List;

public class Main {

    private static final String input = "public class Main {\n" +
            "\n" +
            "    public static void main(String[] args) {\n" +
            "    int i = 151315;\n" +
            "    int l = (1 > 0) ? 13 : 133;\n" +
            "    int m = 12 + 11;\n" +
            "    String s = \"test\" \n" +
            "\n" +
            "        try {\n" +
            "            List<Token> result = new Scanner(input, new SimpleTokenFactory()).scan();\n" +
            "            result.forEach(token -> System.out.println(token.toString()));\n" +
            "\n" +
            "            HtmlPrinter.print(result);\n" +
            "        }\n" +
            "        catch (UnclosedTagException e){\n" +
            "            e.printStackTrace();\n" +
            "        }\n" +
            "\n" +
            "    }\n" +
            "}";
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
