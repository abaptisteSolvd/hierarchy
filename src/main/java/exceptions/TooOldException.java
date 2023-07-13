package exceptions;

public class TooOldException extends Exception {
    public TooOldException(String s) {
        super(s);
    }
    public TooOldException() {
        super();
    }
    public TooOldException(Throwable cause) {
        super(cause);
    }
}
