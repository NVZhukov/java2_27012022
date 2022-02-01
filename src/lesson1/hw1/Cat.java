package lesson1.hw1;

public class Cat implements Player{
    private int maxRun;
    private int maxJump;

    private boolean isInJob;

    public Cat(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        isInJob = true;
    }

    @Override
    public void run(int dist) {
        if(dist<=maxRun){
            System.out.println("Кот пробежал "+ dist);
        }else {
            System.out.println("Кот не смог пробежать "+ dist);
            isInJob=false;
        }
    }

    @Override
    public void jump(int dist) {
        if(dist<=maxJump){
            System.out.println("Кот перепрыгнул "+ dist);
        }else {
            System.out.println("Кот не смог перепрыгнуть "+ dist);
            isInJob=false;
        }
    }

    @Override
    public boolean isInJob() {
        return isInJob;
    }
}
