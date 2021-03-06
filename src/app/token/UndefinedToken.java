package app.token;

public class UndefinedToken extends Token {

    public UndefinedToken(Character element) {
        this.append(element);
    }

    @Override
    public String toString() {
        return "Undefined: " + characters;
    }

    @Override
    public String color() {
        return "#ff0000";
    }
}
