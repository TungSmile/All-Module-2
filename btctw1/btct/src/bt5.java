import java.util.Scanner;

public class bt5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum=0;
        for (int i = 10; i <=99 ; i++) {
            boolean check=true;
            for (int j = 2; j <=Math.sqrt(i) ; j++) {
                if(i%j==0){
                    check=false;
                    break;
                }
            }
            if(check){
                sum+=i;
            }
        }
        System.out.println("sum: "+sum  );
    }
}
