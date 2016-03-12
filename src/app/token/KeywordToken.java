package app.token;

import java.util.Arrays;
import java.util.List;

public class KeywordToken extends Token {

    private static final List<String> keywords = Arrays.asList(
            "abstract", "continue", "for", "new", "switch",
            "assert", "default", "goto", "package", "synchronized",
            "boolean", "do", "if", "private", "this",
            "break", "double", "implements", "protected", "throw",
            "byte", "else", "import", "public", "throws",
            "case", "enum", "instanceof", "return", "transient",
            "catch", "extends", "int", "short", "try",
            "char", "final", "interface", "static", "void",
            "class", "finally", "long", "strictfp", "volatile",
            "const", "float", "native", "super", "while"
    );

    private static final List<String> classKeywords = Arrays.asList(
            "abstract",
            "private", "this",
            "implements", "protected",
            "public", "extends", "final", "interface", "static",
            "class"
    );

    public KeywordToken(List<Character> characters) {
        this.characters = characters;
    }

    public static boolean isKeyword(String token) {
        return keywords.contains(token) ;
    }

    public static boolean isClassKeyword(String token) {
        return classKeywords.contains(token) ;
    }

}
