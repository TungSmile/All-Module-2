import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập a");
        int a = input.nextInt();
        int sum = 0;
        for (int i = 2; i <= a; i++) {
            boolean check = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                sum += i;
            }
        }
        System.out.println("sum prime to a is: " + sum);
    }
}
