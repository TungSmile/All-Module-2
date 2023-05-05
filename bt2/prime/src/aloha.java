import java.util.Scanner;

public class aloha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("input number");
        int number = scan.nextInt();
        if (number < 2) {
            System.out.println("not Prime");
        } else {
            boolean check = false;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    check = true;
                    break;
                }
            }
            if (check) {
                System.out.println("not Prime");
            } else {
                System.out.println(" Prime");
            }
        }
    }
}
