package app.token;

public class AnnotationToken extends Token {

    public AnnotationToken(Character character) {
        this.append(character);
    }

    @Override
    public String color() {
        return "#808000";
    }
}
