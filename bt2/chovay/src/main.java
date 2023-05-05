import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("có nhiêu tiền");
        int money = scan.nextInt();
        System.out.println("tỷ lệ lãi suất trên năm");
        double rate = scan.nextDouble();
        System.out.println("tháng");
        int month = scan.nextInt();
        double lai=0;
        for (int i = 0; i < month; i++) {
            lai +=  (money * (rate / 100) / 12 * month);
        }
        lai=(int)lai;
        System.out.println(lai);
    }
}
