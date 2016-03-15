package app.creator;

import app.UnclosedTagException;
import app.token.AnnotationToken;
import app.token.Token;

public class AnnotationCreator extends BaseTokenCreator implements TokenCreator {

    @Override
    public boolean matches(Character element) {
        if(token == null){
            return element.equals('@');
        }
        else {
            return Character.isAlphabetic(element);
        }
    }

    @Override
    public Token getToken() throws UnclosedTagException {
        return token;
    }

    @Override
    public void create(Character element) {
        token = new AnnotationToken(element);
    }
}
