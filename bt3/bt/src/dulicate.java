import java.util.Scanner;

public class dulicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input arr");
        String arr = input.nextLine();
        for (int i = 0; i < arr.length(); i++) {
            int count = 0;
            for (int j = i; j < arr.length() ; j++) {
                if (arr.charAt(i) == arr.charAt(j)) {
                    count++;
                }

            }
            if (count > 1) {
                System.out.println("ký tự " + arr.charAt(i) + " lặp " + count);
            }
        }
    }
}
