package app.creator;

import app.UnclosedTagException;
import app.token.NumberToken;
import app.token.Token;

public class NumberTokenCreator extends BaseTokenCreator implements TokenCreator {

    @Override
    public boolean matches(Character element) {
        return Character.isDigit(element);
    }

    @Override
    public Token getToken() throws UnclosedTagException {
        return token;
    }

    @Override
    public void create(Character element) {
        token = new NumberToken(element);
    }

}
