package app.token.creator;

import app.UnclosedTagException;
import app.token.Token;
import app.token.WhitespaceToken;

import java.util.Arrays;
import java.util.List;

public class WhitespaceCreator implements TokenCreator {

    private static final List<String> mathOperators = Arrays.asList(
            " "
    );

    private Token token;

    @Override
    public boolean matches(Character element) {

        return mathOperators
                .stream()
                .filter(x -> x.equals(element.toString()))
                .findAny()
                .isPresent();
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
