package lesson1.hw1;

public class Main {
    public static void main(String[] args) {
        Player[] players = new Player[]{
                new Human(1000, 3),
                new Cat(500, 2),
                new Robot(3000, 5)
        };

        Obstacle[] obstacles = new Obstacle[]{
                new Treadmill(1000),
                new Wall(2)
        };

        for (Player p : players) {
            for (Obstacle o : obstacles){
                o.doIt(p);
                if(p.isInJob()==false){
                    break;
                }
            }
        }
    }
}
