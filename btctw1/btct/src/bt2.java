import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập khoảng a-b");
        System.out.println("input a");
        int a = input.nextInt();
        System.out.println("input b");
        int b = input.nextInt();
        for (int i = a; i < b; i++) {
            int sum=0;
            for (int j = 1; j < i; j++) {
                if (i%j==0){
                    sum+=j;
                }
            }
            if(sum==i){
                System.out.println("number prefer: "+i);
            }
        }
    }

}
