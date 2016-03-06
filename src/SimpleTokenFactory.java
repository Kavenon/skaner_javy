import token.*;

public class SimpleTokenFactory implements TokenFactory {

    @Override
    public Token getToken(Character element, Character next, Scanner scanner) {
        if(Character.isDigit(element)){
            return new NumberToken(element);
        }
        else if(Character.isAlphabetic(element)){
            return new CharacterToken(element);
        }
        else if(element.equals('+')){
            return new PlusToken();
        }
        else if(element.equals('-')){
            return new MinusToken();
        }
        else if(element.equals('/')){
            return new DivideToken();
        }
        else if(element.equals('*')){

            if(next.equals('*')){
                scanner.skipElement();
                return new PowerToken();
            }
            else {
                return new MultiplyToken();
            }

        }
        else {
            return new UndefinedToken(element);
        }
    }
}
