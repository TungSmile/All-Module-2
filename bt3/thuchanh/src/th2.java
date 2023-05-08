import java.util.Scanner;

public class th2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] list = {"ac", "b", "c"};
        String arr = input.next();
        if (check(arr, list)) {
            System.out.println("trung");
        } else {
            System.out.println("ko trung");
        }
    }

    public static boolean check(String a, String[] b) {
        for (int i = 0; i < b.length; i++) {
            if (b[i].equals(a)) {
                return true;
            }
        }
        return false;
    }
}
