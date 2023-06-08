import java.util.Scanner;

import static java.lang.Math.sqrt;

public class bt2 {
    public static void main(String[] args) { // tìm số chính phương gần nhất và nhỏ hơn số input
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean check=true;
        while (check){
            number--;
            if(sqrt(number)%1==0){
                check=false;
                System.out.println("số chính phương pre : "+number);
            }

        }
    }
}
