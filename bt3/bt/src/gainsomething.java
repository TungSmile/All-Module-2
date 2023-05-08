import java.util.Scanner;

public class gainsomething {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("value");
        int value = input.nextInt();
        System.out.println("index");

        int index = input.nextInt();
        while (index > 0 && index < 20) {
            int index = input.nextInt();
        }
    }
}
