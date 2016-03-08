package app;

public class UnclosedTagException extends Exception {
    public UnclosedTagException() {
        super();
    }

    public UnclosedTagException(String message) {
        super(message);
    }

    public UnclosedTagException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnclosedTagException(Throwable cause) {
        super(cause);
    }

    protected UnclosedTagException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
