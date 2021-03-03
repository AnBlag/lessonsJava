package Lesson7.Zoo.exception;

public class ToGiveSomeFoodException extends IllegalArgumentException{
    public ToGiveSomeFoodException() {
    }

    public ToGiveSomeFoodException(String s) {
        super(s);
    }

    public ToGiveSomeFoodException(String message, Throwable cause) {
        super(message, cause);
    }

    public ToGiveSomeFoodException(Throwable cause) {
        super(cause);
    }
}
