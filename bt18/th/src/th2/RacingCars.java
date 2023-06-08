import java.util.Random;
import static Main.DISTANCE;

public class RacingCars implements Runnable{
private String name;

    public RacingCars(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int runDistance=0;
        long startTime=System.currentTimeMillis();
        while (runDistance< DISTANCE){ //DISTANCE biến static đợi truyền vào
            try {
                int speed=(new Random()).nextInt(20);
                runDistance += speed;
                String log ="|";
                int percentTravel=(runDistance*100)/
            }
        }
    }
}
