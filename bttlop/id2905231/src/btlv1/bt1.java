import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {//tìm số hoàn thiện tiêp theo
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean check = true;
        while (check) {
            number++;
            int sum = 0;
            for (int i = 1; i < number - 1; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            if(sum==number){
                System.out.println("số kế tiêp : "+sum  );
                check =false;
            }
        }

    }
}
