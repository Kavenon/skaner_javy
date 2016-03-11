package app.token.creator;

import app.UnclosedTagException;
import app.token.Token;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FiniteSymbolCreator  {

    private int maxLength = 0;
    protected List<String> symbols = new ArrayList<>();

    public FiniteSymbolCreator(List<String> symbols) {
        this.symbols = symbols;
        this.maxLength = symbols.stream().map(String::length).max(Comparator.comparingInt(value -> value)).get();
    }

    private int currentTokenLength;
    protected Token token;

    public boolean matches(Character element) {

        for (String operator : symbols) {
            char[] chars = operator.toCharArray();
            try {
                if(element.equals(chars[currentTokenLength])){
                    currentTokenLength++;
                    return true;
                }
            }
            catch(Exception e){
            }

        }

        currentTokenLength++;
        return false;
    }

    public Token getToken() throws UnclosedTagException {

        if(symbols.contains(token) && token.getString().length() == currentTokenLength){
            return token;
        }

        return null;
    }

    public boolean hasMoreCharacters() {
        return currentTokenLength < maxLength;
    }

    public void append(Character next) {
        token.append(next);
    }

}
