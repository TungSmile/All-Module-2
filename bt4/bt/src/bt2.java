import java.time.LocalTime;
import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("go 1 de start");
        int a= input.nextInt();
        if(a==1) {
            StopWatch.start();
            System.out.println("bat dau dem"+StopWatch.getStartTime());
            System.out.println("go 2 de end");
            int b = input.nextInt();
            if (b == 2) {
                StopWatch.stop();
                System.out.println("dung dem"+StopWatch.getEndTime());
                System.out.println("thoi gian dem :"+StopWatch.getElapsedTime());
            }
        }

    }
}
class StopWatch{
    public static int startTime,endTime;

    public static int getStartTime() {
        return startTime;
    }

    public static int getEndTime() {
        return endTime;
    }
    public static void start(){
        startTime = (int)(System.currentTimeMillis() / 1000);

    }
    public static void stop(){
        endTime = (int)(System.currentTimeMillis() / 1000);
    }

    public static int getElapsedTime(){
        return endTime-startTime;
    }
}