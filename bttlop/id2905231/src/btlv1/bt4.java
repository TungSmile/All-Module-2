package btlv1;

import java.util.Scanner;


public class bt4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        String[] temp = number.split(",");
        System.out.println(check(temp));
    }

    public static String check(String[] a) {
        for (int i = 1; i < a.length-1; i++) {
            int temp = Integer.parseInt(a[i]);
            int temp1 = Integer.parseInt(a[i - 1]);
            int sum = Integer.parseInt(a[i+1]);
            if (temp+temp1!=sum){
                return "Méo";
            }
        }
        return "Done";
    }
}
