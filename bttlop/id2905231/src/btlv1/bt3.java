import java.util.Scanner;

import static java.lang.Math.sqrt;

public class bt3 {
    public static void main(String[] args) {// tìm số nguyên tố tô nhâ trong mảng
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        String[] temp = number.split(",");
        int max = -1;
        for (int i = 0; i < temp.length; i++) {
            int a = Integer.parseInt(temp[i]);
            if (max < a && checkPrime(a)) {
                max = a;
            }
        }
        if (max != -1) {
            System.out.println("số nguyên tố to nhất : " + max);
        }
    }

    public static boolean checkPrime(int n) {
        int count = 0;
        for (int i = 2; i <= sqrt(n); i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            return true;
        } else return false;

    }
}
