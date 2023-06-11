package th2;

import java.util.Random;

import static th2.Main.DISTANCE; // biến static có thể dùng khác class ko cần gọi class nhưng nhét
import static  th2.Main.STEP;
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
                int percentTravel=(runDistance*100)/DISTANCE;
                for (int i = 0; i < DISTANCE; i += STEP) {
                    if (percentTravel >= i + STEP) {
                        log += "=";
                    } else if (percentTravel >= i && percentTravel < i + STEP) {
                        log += "o";
                    } else {
                        log += "-";
                    }
                }
                log += "|";
                System.out.println("Car" + this.name + ": " + log + " " + Math.min(DISTANCE, runDistance) + "KM");
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Car" + this.name + " broken...");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car" + this.name + " Finish in " + (endTime - startTime) / 1000 + "s");
    }
}
