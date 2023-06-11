package btlv2;

import java.util.Objects;
import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String incmnput = scanner.nextLine();
        StringBuilder rs = new StringBuilder();
        for (int i = 0; i < incmnput.length(); i++) {
            int count = 0;
            for (int j = i+1; j < incmnput.length(); j++) {
                if (incmnput.charAt(i) == incmnput.charAt(j)) {
                    count++;
                }
            }
            if (count == 0)
                rs.append(incmnput.charAt(i));
        }
        System.out.println(rs);
    }
}



