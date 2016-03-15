package app.token;

public class SquareBracketToken extends Token{

    public SquareBracketToken(Character character) {
         this.append(character);
    }

    @Override
    public String color() {
        return "#800080";
    }
}
