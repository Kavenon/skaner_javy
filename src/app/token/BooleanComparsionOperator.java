package app.token;

import java.util.stream.Collectors;

public class BooleanComparsionOperator extends Token {

    public BooleanComparsionOperator(Character character) {
        this.append(character);
    }

    @Override
    public String toString() {
        return "BooleanComparsion: [" + characters.stream().map(Object::toString).collect(Collectors.joining())+"]";
    }

}
