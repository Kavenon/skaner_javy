package app.token.creator;

import app.Scanner;
import app.token.NumberToken;
import app.token.Token;

public class NumberTokenCreator implements TokenCreator {

    @Override
    public boolean matches(Character element, Character next, Scanner scanner) {
        return Character.isDigit(element);
    }

    @Override
    public Token getToken(Character element) {
        return new NumberToken(element);
    }

}
