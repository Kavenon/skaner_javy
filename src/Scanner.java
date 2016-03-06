import token.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Scanner {

    private ArrayList<Token> output = new ArrayList<>();
    private String input;
    private int currentIndex = 0;

    private TokenFactory tokenFactory;

    public Scanner(String input, TokenFactory tokenFactory) {
        this.input = input;
        this.tokenFactory = tokenFactory;
    }

    public List<Token> scan(){
        ArrayList<Character> characters = splitToCharacters(input);

        Token previousToken = null;
        for (currentIndex = 0; currentIndex < characters.size(); currentIndex++) {

            Character element = characters.get(currentIndex);
            Character next = getNextCharacter(characters);

            Token token = tokenFactory.getToken(element, next, this);
            if(token != null){

                if(previousToken != null && previousToken.hasMoreThanOneCharacter()){
                    boolean added = previousToken.addNextCharacter(token, element);

                    if(!added){
                        output.add(token);
                        previousToken = token;
                    }
                }
                else {
                    output.add(token);
                    previousToken = token;

                }

            }


        }

        return output;

    }

    public void skipElement(){
        currentIndex++;
    }

    private Character getNextCharacter(ArrayList<Character> characters) {
        try {
            return characters.get(currentIndex + 1);
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
