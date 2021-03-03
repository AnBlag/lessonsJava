package lesson.zoo.exception;

public class RandomValueOutOfBound extends IllegalArgumentException {
    public RandomValueOutOfBound() {
    }

    public RandomValueOutOfBound(String s) {
        super(s);
    }

    public RandomValueOutOfBound(String message, Throwable cause) {
        super(message, cause);
    }

    public RandomValueOutOfBound(Throwable cause) {
        super(cause);
    }
}
