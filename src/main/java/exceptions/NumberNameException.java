package exceptions;

public class NumberNameException extends Exception {
    public NumberNameException(String s) {
        super(s);
    }
    public NumberNameException() {
        super();
    }
    public NumberNameException(Throwable cause) {
        super(cause);
    }
}
