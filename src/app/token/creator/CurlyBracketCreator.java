package app.token.creator;

import app.UnclosedTagException;
import app.token.CurlyBracketToken;
import app.token.Token;

import java.util.Arrays;
import java.util.List;

public class CurlyBracketCreator extends BaseTokenCreator implements TokenCreator {

    private static List<Character> allowedCharacters = Arrays.asList('{', '}');

    @Override
    public boolean matches(Character element) throws UnclosedTagException {
        return allowedCharacters.contains(element);
    }

    @Override
    public Token getToken() throws UnclosedTagException {
        return token;
    }

    @Override
    public void create(Character element) {
        token = new CurlyBracketToken(element);
    }

    @Override
    public boolean hasMoreCharacters() {
        return false;
    }

    @Override
    public void append(Character next) {
    }
}
