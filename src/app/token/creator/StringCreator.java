package app.token.creator;

import app.UnclosedTagException;
import app.token.StringToken;
import app.token.Token;

public class StringCreator extends BaseTokenCreator implements TokenCreator {

    private boolean quoteOccurredTwice = false;

    @Override
    public boolean matches(Character element) {
        if(token == null){
            return element.equals('"');
        }
        else {
            if(element.equals('"'))
                quoteOccurredTwice = true;
            return Character.isDefined(element);
        }
    }

    @Override
    public boolean hasMoreCharacters() {
        return !quoteOccurredTwice;
    }

    @Override
    public Token getToken() throws UnclosedTagException {
        if(token.getCharacters().size() < 2)
            throw new UnclosedTagException("wrong string");

        if(!token.getCharacters().get(0).equals('"') || !token.getCharacters().get(token.getCharacters().size()-1).equals('"')){
            throw new UnclosedTagException("wrong string");
        }

        return token;
    }

    @Override
    public void create(Character element) {
        token = new StringToken(element);
    }
}
