package lesson10.exceptionsСages;

public class UniqueAnimalsCageException extends IllegalArgumentException {
    public UniqueAnimalsCageException() {
    }

    public UniqueAnimalsCageException(String s) {
        super(s);
    }

    public UniqueAnimalsCageException(String message, Throwable cause) {
        super(message, cause);
    }

    public UniqueAnimalsCageException(Throwable cause) {
        super(cause);
    }
}
