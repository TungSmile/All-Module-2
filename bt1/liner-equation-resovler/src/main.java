import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("giải phương trình");
        System.out.println("a*x+b=c");
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a");
        double a = scanner.nextDouble();
        System.out.println("input b");
        double b = scanner.nextDouble();
        System.out.println("input c");
        double c = scanner.nextDouble();
        if (a != 0) {
            double result = (c - b) / a;
            System.out.printf("x= %f!\n",result);
        }else {
            if(b==c){
                System.out.println("vô số nghiệm =%f!\n");
            }else {
                System.out.println("vô nghiệm");
            }
        }
    }
}
