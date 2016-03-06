package token;

public class CharacterToken implements Token {

    private Character character;

    public CharacterToken(Character element) {
        this.character = element;
    }

    @Override
    public String toString() {
        return "Character: " + character;
    }

}
