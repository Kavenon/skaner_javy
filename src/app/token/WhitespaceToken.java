package app.token;

public class WhitespaceToken extends Token {

    public WhitespaceToken(Character character) {
        this.append(character);
    }

    @Override
    public String toString() {
        return "Whitespace: " + characters;
    }

}
