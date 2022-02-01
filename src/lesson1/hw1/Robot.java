package lesson1.hw1;

public class Robot implements Player{
    private int maxRun;
    private int maxJump;

    private boolean isInJob;

    public Robot(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        isInJob = true;
    }

    @Override
    public void run(int dist) {
        if(dist<=maxRun){
            System.out.println("Робот пробежал "+ dist);
        }else {
            System.out.println("Робот не смог пробежать "+ dist);
            isInJob=false;
        }
    }

    @Override
    public void jump(int dist) {
        if(dist<=maxRun){
            System.out.println("Робот перепрыгнул "+ dist);
        }else {
            System.out.println("Робот не смог перепрыгнуть "+ dist);
            isInJob=false;
        }
    }

    @Override
    public boolean isInJob() {
        return isInJob;
    }
}
