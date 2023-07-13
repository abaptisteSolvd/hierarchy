package exceptions;

public class DogNotCatException extends Exception {
    public DogNotCatException(String s) {
        super(s);
    }
    public DogNotCatException() {
        super();
    }
    public DogNotCatException(Throwable cause) {
        super(cause);
    }
}
