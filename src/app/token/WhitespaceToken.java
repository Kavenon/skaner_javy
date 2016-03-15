package app.token;

public class WhitespaceToken extends Token {

    public WhitespaceToken(Character character) {
        this.append(character);
    }

    @Override
    public String getHtml() {
        if(characters.get(0).equals(' '))
            return "&nbsp;";
        else if(characters.get(0).equals('\n'))
            return "<br />";

        return getString();
    }

    @Override
    public String color() {
        return "#000";
    }
}
