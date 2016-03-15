package app.creator;

import app.UnclosedTagException;
import app.token.IdentificatorToken;
import app.token.KeywordToken;
import app.token.Token;

public class IdentificatorCreator extends BaseTokenCreator implements TokenCreator {

    @Override
    public boolean matches(Character element) {
        return Character.isAlphabetic(element) || (token != null && token.getString().length() > 1 && Character.isDigit(element));
    }

    @Override
    public Token getToken() throws UnclosedTagException {
        if(KeywordToken.isKeyword(token.getString()))
            return new KeywordToken(token.getCharacters());
        return token;
    }

    @Override
    public void create(Character element) {
        token = new IdentificatorToken(element);
    }
}
