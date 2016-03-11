package app.token.creator;

import app.Scanner;
import app.UnclosedTagException;
import app.token.NumberToken;
import app.token.Token;

public class NumberTokenCreator implements TokenCreator {


    @Override
    public boolean matches(Character element) {
        return false;
    }

    @Override
    public Token getToken() throws UnclosedTagException {
        return null;
    }

    @Override
    public void create(Character element) {

    }

    @Override
    public boolean hasMoreCharacters() {
        return false;
    }

    @Override
    public void append(Character next) {

    }
}
