package app.token;

public class EqualityOperator extends Token {

    public EqualityOperator(Character character) {
        this.append(character);
    }

    @Override
    public String color() {
        return "#FF6106";
    }
}
