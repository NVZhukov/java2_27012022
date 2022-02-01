package lesson1.hw1;

public class Wall implements Obstacle{
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Player p) {
        p.jump(height);
    }
}
