package app.token;

public class NumberToken extends Token {

    public NumberToken(Character character) {
        this.append(character);
    }

    @Override
    public String color() {
        return "#0909FE";
    }
}
