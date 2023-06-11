package btlv1;

import java.util.Scanner;

public class bt6 {
    public static void timAmong(int start, int end) { // check số ámtrong
        int temp = start;
        while (temp < end) {
            int temp2 = temp;
            int sum = 0;
            while (temp2 != 0) {
                int temp3 = temp2 % 10;
                sum += temp3 * temp3 * temp3;
                temp2 /= 10;

            }
            if (sum == temp) {
                System.out.println("số amstrong : " + temp);
            }
            temp++;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        timAmong(a, b);
    }
}
