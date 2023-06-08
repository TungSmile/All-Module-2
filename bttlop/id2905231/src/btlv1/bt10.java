public class bt10 {
    public static void main(String[] args) {
        for (int number = 0; number < 1000; number++) {
            boolean check = true;
            while (check) {
                number++;
                int sum = 0;
                for (int i = 1; i < number - 1; i++) {
                    if (number % i == 0) {
                        sum += i;
                    }
                }
                if (sum == number) {
                    System.out.println("số kế tiêp : " + sum);
                    check = false;
                }
            }
        }
    }
}