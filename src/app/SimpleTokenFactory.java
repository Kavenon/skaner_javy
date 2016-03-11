package app;

import app.token.*;
import app.token.creator.*;

public class SimpleTokenFactory implements TokenFactory {

    private static final WhitespaceCreator whitespaceCreator = new WhitespaceCreator();
    private static final TokenCreator[] allowedTokens = {
            whitespaceCreator,
            new NumberTokenCreator(),
            new MathOperatorCreator(),
            new BooleanCreator(),
    };

    @Override
    public Token getToken(Character element, Scanner scanner) throws UnclosedTagException {

        for (TokenCreator tokenCreator : allowedTokens) {

            if(tokenCreator.matches(element)){
                scanner.beginTransaction();
                Character next = scanner.getNextCharacter();
                tokenCreator.create(element);

                if(next != null && !whitespaceCreator.matches(next)) {

                    while (next != null && tokenCreator.hasMoreCharacters()) {
                        if (tokenCreator.matches(next)) {
                            tokenCreator.append(next);
                            next = scanner.getNextCharacter();
                        } else {
                            break;
                        }
                    }
                }

                if (tokenCreator.getToken() != null) {
                    scanner.commit();
                    return tokenCreator.getToken();
                }
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