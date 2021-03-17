package lesson10.exceptionsСages;

public class OverflowCageException extends IndexOutOfBoundsException{
    public OverflowCageException(){}

    public OverflowCageException(String s) {
        super(s);
    }

    public OverflowCageException(int index) {
        super(index);
    }

}
