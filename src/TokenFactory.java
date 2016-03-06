import token.Token;

public interface TokenFactory {

    Token getToken(Character now, Character next, Scanner scanner);
}
