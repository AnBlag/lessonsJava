package lesson10.exceptionsСages;

public class OverflowCage extends IndexOutOfBoundsException{
    public OverflowCage(){}

    public OverflowCage(String s) {
        super(s);
    }

    public OverflowCage(int index) {
        super(index);
    }

}
