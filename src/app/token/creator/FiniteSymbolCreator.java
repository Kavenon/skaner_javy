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

    protected int currentTokenLength;
    protected Token token;

    private boolean matchesBefore(char[] chars){
        boolean matchesBefore = false;
        if(token != null){
            for(int i = 0; i < currentTokenLength;i++){
                if(token.getCharacters().get(i).equals(chars[i])){
                    matchesBefore = true;
                }
            }
        }
        return matchesBefore;
    }
    public boolean matches(Character element) {

        for (String operator : symbols) {
            char[] chars = operator.toCharArray();
            try {
                if(element.equals(chars[currentTokenLength])){

                    if(token == null || matchesBefore(chars)){
                        currentTokenLength++;
                        return true;
                    }

                }
            }
            catch(Exception e){
            }

        }

//        currentTokenLength++;
        return false;
    }

    public Token getToken() throws UnclosedTagException {
// sprawdzic czy mozna usunac length
        if(symbols.contains(token.getString()) && token.getString().length() == currentTokenLength){
            return token;
        }

        currentTokenLength = 0;
        return null;
    }

    public boolean hasMoreCharacters() {
        return currentTokenLength < maxLength;
    }

    public void append(Character next) {
        token.append(next);
    }

}
