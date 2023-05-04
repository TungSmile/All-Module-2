import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("tỷ giá vnd và usd");
        double rate=scan.nextDouble();
        System.out.println("input vnd");
        double vnd=scan.nextDouble();
        double usd=vnd/rate;
        System.out.println("đổi đc  "+usd+"đô");
    }
}
