package app;

import app.token.*;
import app.creator.*;

public class SimpleTokenFactory implements TokenFactory {

    private static final WhitespaceCreator whitespaceCreator = new WhitespaceCreator();
    private static final TokenCreator[] allowedTokens = {
            whitespaceCreator,
            new NumberTokenCreator(),
            new BooleanCreator(),
            new MathOperatorCreator(),
            new IdentificatorCreator(),
            new ParenthesisCreator(),
            new CurlyBracketCreator(),
            new SquareBracketCreator(),
            new AnnotationCreator(),
            new CharacterCreator(),
            new StringCreator(),
    };

    @Override
    public Token getToken(Character element, Scanner scanner) throws UnclosedTagException {

        for (TokenCreator tokenCreator : allowedTokens) {

            if(tokenCreator.matches(element)){
                scanner.beginTransaction();
                Character next = scanner.getNextCharacter();
                tokenCreator.create(element);

                // tutaj bylo if creator != whitespace
                if(next != null && (!whitespaceCreator.matches(next))) {

                    while (next != null && tokenCreator.hasMoreCharacters()) {
                        if (tokenCreator.matches(next)) {
                            tokenCreator.append(next);
                            next = scanner.getNextCharacter();
                        } else {
                            break;
                        }
                    }
                }

                Token token = tokenCreator.getToken();
                if (token != null) {
                    scanner.commit();
                    return token;
                }
            }
        }
        return new UndefinedToken(element);

    }
}
