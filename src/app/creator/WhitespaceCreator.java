package app.creator;

import app.UnclosedTagException;
import app.token.Token;
import app.token.WhitespaceToken;

import java.util.Arrays;
import java.util.List;

public class WhitespaceCreator implements TokenCreator {

    private Token token;

    @Override
    public boolean matches(Character element) {
        return Character.isWhitespace(element);
    }

    @Override
    public Token getToken() throws UnclosedTagException {
        return token;
    }

    @Override
    public void create(Character element) {
        token = new WhitespaceToken(element);
    }

    @Override
    public boolean hasMoreCharacters() {
        return true;
    }

    @Override
    public void append(Character next) {
        token.append(next);
    }


}
