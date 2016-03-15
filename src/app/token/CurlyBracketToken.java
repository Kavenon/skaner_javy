package app.token;

public class CurlyBracketToken extends Token{

    public CurlyBracketToken(Character character) {
         this.append(character);
    }

    @Override
    public String color() {
        return "#800080";
    }
}
