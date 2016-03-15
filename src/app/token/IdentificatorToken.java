package app.token;

public class IdentificatorToken extends Token {

    public IdentificatorToken(Character character) {
        this.append(character);
    }

    @Override
    public String color() {
        return "#000";
    }
}
