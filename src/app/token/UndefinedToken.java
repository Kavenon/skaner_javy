package app.token;

public class UndefinedToken implements Token {

    private Character character;

    public UndefinedToken(Character element) {
        this.character = element;
    }

    @Override
    public String toString() {
        return "Undefined: " + character;
    }

}
