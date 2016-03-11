package app.token;

public class MathOperator extends Token {

    public MathOperator(Character character) {
        this.append(character);
    }

    @Override
    public String toString() {
        return "MathOperator: " + characters;
    }

}
