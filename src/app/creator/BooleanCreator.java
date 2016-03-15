package app.creator;

import app.token.EqualityOperator;

import java.util.Arrays;
import java.util.List;

public class BooleanCreator extends FiniteSymbolCreator implements TokenCreator {

    private static final List<String> operators = Arrays.asList(
           "==", "!="
    );

    public BooleanCreator() {
        super(operators);
    }
    @Override
    public void create(Character element) {
        token = new EqualityOperator(element);
    }

}
