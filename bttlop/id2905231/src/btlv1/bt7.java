package btlv1;

import java.util.Scanner;

public class bt7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        String[] temp = number.split(",");
        System.out.println(sum(temp));
    }

    public static int sum(String[] e){
        int sum=0;
        for (int i = 0; i < e.length; i++) {
            int a=Integer.parseInt(e[i]);
            sum+=a;
        }
        return sum;
    }
}
