public class bt9 {
    public static void main(String[] args) {
        int temp = 1;
        while (temp < 1000) {
            int temp2 = temp;
            int sum = 0;
            while (temp2 != 0) {
                int temp3 = temp2 % 10;
                sum += temp3 * temp3 * temp3;
                temp2 /= 10;

            }
            if (sum == temp) {
                System.out.println("số amstrong : " + temp);
            }
            temp++;
        }
    }
}
