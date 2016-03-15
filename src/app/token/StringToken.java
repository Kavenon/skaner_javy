package app.token;

public class StringToken extends Token {

    public StringToken(Character character) {
        this.append(character);
    }

    @Override
    public String color() {
        return "#008055";
    }

}
