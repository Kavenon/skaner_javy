package app.token.creator;

import app.UnclosedTagException;
import app.token.BooleanComparsionOperator;
import app.token.Token;

import java.util.Arrays;
import java.util.List;

public class BooleanCreator implements TokenCreator {

    private static final int MAX_LENGTH = 2;
    private static final List<String> mathOperators = Arrays.asList(
           "==", "!="
    );

    private int currentTokenLength;
    private Token token;

    @Override
    public boolean matches(Character element) {

        for (String mathOperator : mathOperators) {
            char[] chars = mathOperator.toCharArray();
            try {
                if(element.equals(chars[currentTokenLength])){
                    currentTokenLength++;
                    return true;
                }
            }
            catch(Exception e){
                currentTokenLength++;
                return false;
            }

        }

        currentTokenLength++;
        return false;
    }

    @Override
    public Token getToken() throws UnclosedTagException {

        if(token.getString().length() == currentTokenLength){
            return token;
        }

        return null;
    }

    @Override
    public void create(Character element) {
        token = new BooleanComparsionOperator(element);
    }

    @Override
    public boolean hasMoreCharacters() {
        return currentTokenLength < MAX_LENGTH;
    }

    @Override
    public void append(Character next) {
        token.append(next);
    }


}
