import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String arr = input.next();
        boolean check = true;
        for (int i = 0; i < arr.length() / 2; i++) {
            if (arr.charAt(i) != arr.charAt(arr.length() - i-1)) {
                check = false;
            }
        }
        if (check) {
            System.out.println("doi xung");
        }else {
            System.out.println("ko doi xung");
        }
    }
}
