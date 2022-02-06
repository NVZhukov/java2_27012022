package lesson1.hw1;

public class Treadmill implements Obstacle{
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Player p) {
        p.run(length);
    }
}
