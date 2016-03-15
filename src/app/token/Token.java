package app.token;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Token {

    protected List<Character> characters = new ArrayList<>();

    public void append(Character character){
        this.characters.add(character);
    }

    boolean hasMoreThanOneCharacter()  {
        return false;
    };

    public List<Character> getCharacters() {
        return characters;
    }

    public String getString(){
         return characters.stream().map(Object::toString).collect(Collectors.joining());
    }

    public String getHtml(){
        return getString();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": ["+getString()+"]";
    }

    abstract public String color();

}
