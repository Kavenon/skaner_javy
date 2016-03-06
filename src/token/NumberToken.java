package token;

public class NumberToken implements Token {

    private Character character;

    public NumberToken(Character character) {
        this.character = character;
    }

    @Override
    public String toString() {
        return "Number: " + character;
    }
}
