package token;

public interface Token {

    default boolean hasMoreThanOneCharacter()  {
        return false;
    };

    default boolean addNextCharacter(Token element, Character character){
        return false;
    }

}
