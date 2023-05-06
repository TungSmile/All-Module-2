import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; count < 21; i++) {
            boolean check = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(i);
                count++;
            }
        }
    }
}

