package app.token.creator;

import app.Scanner;
import app.token.Token;
import sun.font.CreatedFontTracker;

public class MathOperators implements TokenCreator {

    private static final Character[] mathOperators = {
            '+', '-', '=', '>', '<', '*', '/', '^', '%'
    };

    @Override
    public boolean matches(Character element, Character next, Scanner scanner) {
        return false;
    }

    @Override
    public Token getToken(Character element) {
        return null;
    }
}
