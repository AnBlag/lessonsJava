package lesson10.exceptionsСages;

public class BoundException extends IndexOutOfBoundsException{
    public BoundException() {}

    public BoundException(String s) {
        super(s);
    }

    public BoundException(int index) {
        super(index);
    }
}
