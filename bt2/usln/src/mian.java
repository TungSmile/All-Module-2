import java.util.Scanner;

public class mian {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("input a");
        int a=scan.nextInt();
        System.out.println("input b");
        int b=scan.nextInt();
        a=Math.abs(a);
        b=Math.abs(b);
        if (a==0||b==0){
            System.out.println("ko có ucln");
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("ucln là :"+a);
    }
}
