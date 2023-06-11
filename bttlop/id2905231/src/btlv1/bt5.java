package btlv1;
import java.util.Scanner;
import java.util.Arrays;

public class bt5 {
    public static String[] sort(String[] e) {
        Arrays.sort(e);
        return e;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String a=scanner.nextLine();
        String[]b=a.split(",");
        sort(b);
        for (String x :b){
            System.out.println(x);
        }
    }

}
