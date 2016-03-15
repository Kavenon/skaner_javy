package app.creator;

import app.Scanner;
import app.token.Token;
import app.UnclosedTagException;

public interface TokenCreator {

    boolean matches(Character element) throws UnclosedTagException;
    Token getToken() throws UnclosedTagException;

    void create(Character element);

    boolean hasMoreCharacters();

    void append(Character next);
}
