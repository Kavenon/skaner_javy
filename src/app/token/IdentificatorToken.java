package app.token;

import java.util.ArrayList;
import java.util.List;

public class IdentificatorToken implements Token {

    private List<Character> character = new ArrayList<>();

    public IdentificatorToken(Character character) {
        this.character.add(character);
    }

    @Override
    public String toString() {
        return "Character: " + character;
    }

    @Override
    public boolean hasMoreThanOneCharacter() {
        return true;
    }

    @Override
    public boolean addNextCharacter(Token element, Character character) {
        if(element instanceof NumberToken || element instanceof IdentificatorToken){
            this.character.add(character);
            return true;
        }
        return false;
    }

}
