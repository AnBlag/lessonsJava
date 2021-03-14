package lesson10.exceptionsСages;

public class UniqueAnimalsCage extends IllegalArgumentException {
    public UniqueAnimalsCage() {
    }

    public UniqueAnimalsCage(String s) {
        super(s);
    }

    public UniqueAnimalsCage(String message, Throwable cause) {
        super(message, cause);
    }

    public UniqueAnimalsCage(Throwable cause) {
        super(cause);
    }
}
