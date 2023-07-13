package exceptions;

public class SpeciesNotAvailableException extends Exception {
    public SpeciesNotAvailableException(String s) {
        super(s);
    }
    public SpeciesNotAvailableException() {
        super();
    }
    public SpeciesNotAvailableException(Throwable cause) {
        super(cause);
    }
}
