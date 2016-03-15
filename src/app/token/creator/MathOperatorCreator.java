package app.token.creator;

import app.token.MathOperator;

import java.util.Arrays;
import java.util.List;

public class MathOperatorCreator extends FiniteSymbolCreator implements TokenCreator {

    private static final List<String> mathOperators = Arrays.asList(
            "+", "-", "=", ">", "<", "*", "/", "^", "%",
            "+=", "-=", "<=", ">="
    );

    public MathOperatorCreator() {
        super(mathOperators);
    }

    @Override
    public void create(Character element) {
        currentTokenLength = 1;
        token = new MathOperator(element);
    }


}
