package app.token;

public class CharacterToken extends Token {

    public CharacterToken(Character character) {
        this.append(character);
    }

    @Override
    public String color() {
        return "#008055";
    }
}
