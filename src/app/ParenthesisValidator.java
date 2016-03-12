package app;

import app.token.Token;

import java.util.List;
import java.util.Stack;

public class ParenthesisValidator {


    public boolean valid(List<Token> output) throws UnclosedTagException {

        if(isValid(output)){
            return true;
        }

        throw new UnclosedTagException();

    }

    private boolean isValid(List<Token> output) {
        Stack<Character> stack = new Stack<>();
        char c;
        for(int i=0; i < output.size(); i++) {
            c = output.get(i).getCharacters().get(0);

            if(c == '(')
                stack.push(c);
            else if(c == ')')
                if(stack.empty())
                    return false;
                else if(stack.peek() == '(')
                    stack.pop();
                else
                    return false;
        }
        return stack.empty();
    }
}
