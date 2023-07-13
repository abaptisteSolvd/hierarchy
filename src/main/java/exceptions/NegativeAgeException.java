package exceptions;

public class NegativeAgeException extends Exception{
    public NegativeAgeException(String s) {
        super(s);
    }
    public NegativeAgeException() {
        super();
    }
    public NegativeAgeException(Throwable cause) {
        super(cause);
    }
}
