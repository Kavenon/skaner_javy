package app.token.creator;

import app.UnclosedTagException;
import app.token.Token;
import app.token.WhitespaceToken;

public class BaseTokenCreator {

    protected Token token;

    public boolean hasMoreCharacters() {
        return true;
    }

    public void append(Character next) {
        token.append(next);
    }
}
