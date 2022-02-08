package lesson2;

public class MyArrayDataException extends RuntimeException{

    private int a;
    private int b;

    public MyArrayDataException(String s, int a, int b) {
        super(s);
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
