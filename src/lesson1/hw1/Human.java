package lesson1.hw1;

public class Human implements Player{
    private int maxRun;
    private int maxJump;

    private boolean isInJob;

    public Human(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        isInJob = true;
    }

    @Override
    public void run(int dist) {
        if(dist<=maxRun){
            System.out.println("Человек пробежал "+ dist);
        }else {
            System.out.println("Человек не смог пробежать "+ dist);
            isInJob=false;
        }
    }

    @Override
    public void jump(int dist) {
        if(dist<=maxRun){
            System.out.println("Человек перепрыгнул "+ dist);
        }else {
            System.out.println("Человек не смог перепрыгнуть "+ dist);
            isInJob=false;
        }
    }

    @Override
    public boolean isInJob() {
        return isInJob;
    }
}
