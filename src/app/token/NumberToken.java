package app.token;

import java.util.ArrayList;
import java.util.List;

public class NumberToken implements Token {

    private List<Character> character = new ArrayList<>();

    public NumberToken(Character character) {
        this.character.add(character);
    }

    @Override
    public String toString() {
        return "Number: " + character;
    }

    @Override
    public boolean hasMoreThanOneCharacter() {
        return true;
    }

    @Override
    public boolean addNextCharacter(Token element, Character character) {
        if(element instanceof NumberToken){
            this.character.add(character);
            return true;
        }
        return false;
    }
}
