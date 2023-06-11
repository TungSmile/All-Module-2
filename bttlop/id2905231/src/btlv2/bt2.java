package btlv2;

import java.util.Arrays;
import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputstr = scanner.nextLine();
        System.out.println(sot(inputstr));
    }

    public static String sot(String str) {
        char[] temp = str.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }

    ;

}
