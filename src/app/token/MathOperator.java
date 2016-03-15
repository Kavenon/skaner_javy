package app.token;

public class MathOperator extends Token {

    public MathOperator(Character character) {
        this.append(character);
    }

    @Override
    public String color() {
        return "#EB4CFF";
    }

}
