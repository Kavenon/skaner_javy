package app;

import app.token.*;
import app.token.creator.NumberTokenCreator;
import app.token.creator.TokenCreator;

public class SimpleTokenFactory implements TokenFactory {

    private static final TokenCreator[] allowedTokens = {
            new NumberTokenCreator(),
    };

    @Override
    public Token getToken(Character element, Scanner scanner) throws UnclosedTagException {

        for (TokenCreator tokenCreator : allowedTokens) {

            if(tokenCreator.matches(element)){

                Character next = scanner.getNextCharacter();
                tokenCreator.create(element);
                while(next != null && tokenCreator.hasMoreCharacters() && tokenCreator.matches(next)){
                    tokenCreator.append(next);
                    next = scanner.getNextCharacter();
                }
                return tokenCreator.getToken();

            }
        }

        return new UndefinedToken(element);

//        if(Character.isDigit(element)){
//            return new NumberToken(element);
//        }
//        else if(Character.isAlphabetic(element)){
//            return new IdentificatorToken(element);
//        }
//        else if(element.equals('+')){
//            return new PlusToken();
//        }
//        else if(element.equals('-')){
//            return new MinusToken();
//        }
//        else if(element.equals('/')){
//            return new DivideToken();
//        }
//        else if(element.equals('*')){
//
//            if(next.equals('*')){
//                scanner.skipElement();
//                return new PowerToken();
//            }
//            else {
//                return new MultiplyToken();
//            }
//
//        }
//        else {
//            return new UndefinedToken(element);
//        }

    }
}
