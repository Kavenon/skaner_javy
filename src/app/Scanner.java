package app;

import app.token.Token;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Scanner {

    private ArrayList<Token> output = new ArrayList<>();
    private ArrayList<Character> characters;
    private int currentIndex = 0;
    private int tempIndex = 0;

    private TokenFactory tokenFactory;

    public Scanner(String input, TokenFactory tokenFactory) {
        this.characters = splitToCharacters(input);
        this.tokenFactory = tokenFactory;
    }

    public List<Token> scan() throws UnclosedTagException {

        for (currentIndex = 0; currentIndex < characters.size(); ++currentIndex) {

            Character element = characters.get(currentIndex);
            Token token = tokenFactory.getToken(element, this);
            output.add(token);

        }

        return output;

    }

    public void beginTransaction(){
        tempIndex = currentIndex;
    }

    public void commit(){
        currentIndex = tempIndex-1;
    }

    public void skipElement(){
        currentIndex++;
    }

    public Character getNextCharacter() {
        tempIndex++;
        try {
            return characters.get(tempIndex);
        }
        catch(IndexOutOfBoundsException e){
            return null;
        }
    }


    private ArrayList<Character> splitToCharacters(String input) {
        Character[] charObjectArray = input.chars()
                .mapToObj(c -> (char)c)
                .toArray(Character[]::new);
        return new ArrayList<>(Arrays.asList(charObjectArray));
    }

}
