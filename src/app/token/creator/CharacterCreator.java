package app.token.creator;

import app.UnclosedTagException;
import app.token.CharacterToken;
import app.token.Token;

public class CharacterCreator extends BaseTokenCreator implements TokenCreator {

    @Override
    public boolean matches(Character element) {
        if(token == null){
            return element.equals('\'');
        }
        else {
            if(token.getCharacters().size() == 1){
                return Character.isDefined(element);
            }
            else if(token.getCharacters().size() == 2){
                return element.equals('\'');
            }
            else{
                return false;
            }
        }
    }

    @Override
    public Token getToken() throws UnclosedTagException {
        if(token.getCharacters().size() != 3)
            throw new UnclosedTagException("wrong character");
        return token;
    }

    @Override
    public void create(Character element) {
        token = new CharacterToken(element);
    }
}
