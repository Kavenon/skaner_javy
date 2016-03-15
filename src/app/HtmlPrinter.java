package app;

import app.token.Token;

import java.util.List;

public class HtmlPrinter {

    public static void print(List<Token> tokens){

        String content = buildContent(tokens);
        FileSaver.save("index.html", content);

    }

    private static String buildContent(List<Token> tokens) {
        StringBuilder sb = new StringBuilder();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("</head>");
        sb.append("<body>");

        for (Token token : tokens) {
            sb.append("<span style=\"color:");
            sb.append(token.color());
            sb.append("\">");
            sb.append(token.getHtml());
            sb.append("</span>");
        }

        sb.append("</body>");
        sb.append("</html>");

        return sb.toString();
    }
}
