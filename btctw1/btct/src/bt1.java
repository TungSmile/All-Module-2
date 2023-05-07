import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập số");
        int number = input.nextInt();
        boolean check = false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                check = true;
                break;
            }
        }
        if (check) {
            System.out.println("not prime");
        }else {
            System.out.println("prime");
        }
    }
}
