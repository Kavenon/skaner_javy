package app;

import app.token.Token;

public interface TokenFactory {

    Token getToken(Character now, Scanner scanner) throws UnclosedTagException;
}
