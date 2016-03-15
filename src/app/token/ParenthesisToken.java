package app.token;

public class ParenthesisToken extends Token{

    public ParenthesisToken(Character character) {
         this.append(character);
    }

    @Override
    public String color() {
        return "#800080";
    }
}
