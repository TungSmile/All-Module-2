package btlv1;

import java.util.Scanner;

public class bt8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        timSNT(number);
    }

    public static void timSNT(int n) {
        int sum = 0;
        for (int i = 2; i < n; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                sum+=i;
            }
        }

    }
}
