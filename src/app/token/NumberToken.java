package app.token;

public class NumberToken extends Token {

    public NumberToken(Character character) {
        this.append(character);
    }

    @Override
    public String toString() {
        return "Number: " + characters;
    }

}
